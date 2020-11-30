package com.yjy.edu.enterprise.advanced.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {

	public static void main(String[] args) throws IOException {
		try (FileWriter writer = new FileWriter("hello.txt");) {
			writer.write("hello world".toCharArray());
		}
		try (FileReader in = new FileReader("hello.txt");) {
			BufferedReader reader = new BufferedReader(in);
			char[] c = new char[1024];
			int offset = 0;
			while ((offset = reader.read(c, offset, 1024 - offset)) != -1) {
				reader.read(c, offset, 1024 - offset);
			}
			System.out.println(new String(c));
		}
	}
}
