package com.yjy.edu.enterprise.advanced.nio;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

public class MemoryMappedFile {

	public static void main(String[] args) throws Exception {
		RandomAccessFile file = new RandomAccessFile("hello.txt", "rw");
		long length = file.length();
		try (FileChannel channel = file.getChannel()) {
			MappedByteBuffer buffer = channel.map(MapMode.READ_ONLY, 0, length);
			byte[] c = new byte[(int) length];
			buffer.get(c, 0, c.length);
			System.out.println(new String(c, "UTF-8"));
		}
		file.close();
	}
}
