package com.yjy.edu.enterprise.advanced.nio;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelExample {

	public static void main(String[] args) throws Exception {
		try (FileInputStream in = new FileInputStream("hello.txt"); FileChannel channel = in.getChannel()) {
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			channel.read(buffer);
			buffer.flip();
			System.out.println(new String(buffer.array(), "UTF-8"));
		}
	}
}
