package com.yjy.edu.enterprise.advanced.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * 运行程序的同时，请运行SocketChannelExample程序作为客户端连接到该服务端
 * @see SocketChannelExample
 */
public class ServerSocketChannelExample {

	public static void main(String[] args) throws Exception {
		Selector selector = Selector.open();
		InetSocketAddress address = new InetSocketAddress("127.0.0.1", 12345);
		ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
		serverSocketChannel.bind(address);
		serverSocketChannel.configureBlocking(false);
		serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					serverSocketChannel.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}));

		while (true) {
			try {
				selector.select();
				Set<SelectionKey> keys = selector.selectedKeys();
				Iterator<SelectionKey> iter = keys.iterator();
				while (iter.hasNext()) {
					SelectionKey key = iter.next();
					iter.remove();
					if (!key.isValid()) {
						continue;
					}
					if (key.isAcceptable()) {
						ServerSocketChannel serverChanel = (ServerSocketChannel) key.channel();
						SocketChannel sc = serverChanel.accept();
						sc.configureBlocking(false);
						sc.register(selector, SelectionKey.OP_READ);
						System.out.println("Got connection from " + sc);
					} else if (key.isReadable()) {
						SocketChannel channel = (SocketChannel) key.channel();
						//为了简单使用HeapBuffer,实际应用中使用堆外缓冲实现性能更好
						ByteBuffer buffer = ByteBuffer.allocate(1024);
						int bytesRead = channel.read(buffer);
						//disconnected
						if(bytesRead == -1){
							System.out.println("disconnected from " + channel);
							channel.close();
							key.cancel();
							continue;
						}
						while (bytesRead > 0) {
							bytesRead = channel.read(buffer);
						}
						String echo = new String(buffer.array(), "UTF-8");
						System.out.println("read " + echo + " from " + channel);
					}  
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
