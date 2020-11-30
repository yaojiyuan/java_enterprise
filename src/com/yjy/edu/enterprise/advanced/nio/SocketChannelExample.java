package com.yjy.edu.enterprise.advanced.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

public class SocketChannelExample {

	public static void main(String[] args) throws Exception {
		InetSocketAddress address = new InetSocketAddress("127.0.0.1", 12345);
		SocketChannel channel = SocketChannel.open(address);
		channel.configureBlocking(false);
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		buffer.put("ready go ".getBytes(Charset.forName("UTF-8")));
		buffer.flip();
		channel.write(buffer);
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					channel.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}));

		for (int i = 0; i < 10; i++) {
			try {
				buffer.clear();
				buffer.put(("hello " + i).getBytes(Charset.forName("UTF-8")));
				buffer.flip();
				TimeUnit.SECONDS.sleep(1);
				channel.write(buffer);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
