package com.yjy.edu.enterprise.advanced.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileByteStream {

	public static void main(String[] args) throws IOException {
		try (FileOutputStream out = new FileOutputStream("hello.txt");) {
			out.write("hello world".getBytes(Charset.forName("UTF-8")));
			out.flush();
		}
		try (FileInputStream in = new FileInputStream("hello.txt");) {
			BufferedInputStream stream = new BufferedInputStream(in);
			byte[] bytes = new byte[1024];
			int offset = 0;
			while ((offset = stream.read(bytes, offset, 1024 - offset)) != -1) {
				stream.read(bytes, offset, 1024 - offset);
			}
			System.out.println(new String(bytes, Charset.forName("UTF-8")));
		}
	}
}
