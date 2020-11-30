package com.yjy.edu.enterprise.advanced.io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class UTF16 {

	public static void utf16() {
		byte[] bytes = new byte[] { (byte) 0x54, (byte) 0x68 };
		System.out.println(new String(bytes, Charset.forName("UTF-16")));
		bytes = new byte[] { (byte) 0xD8, (byte) 0x01 };
		// 这里会乱码，因为0xD801位于保留的代理区
		System.out.println(new String(bytes, Charset.forName("UTF-16")));
	}

	public static void utf16BigEndian() {
		byte[] bytes = "周".getBytes(Charset.forName("UTF-16"));
		for (byte b : bytes) {
			System.out.print(Integer.toBinaryString(b & 0xFF));
			System.out.print(" ");
		}
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		utf16();
		utf16BigEndian();
	}
}
