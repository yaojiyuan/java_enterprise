package com.yjy.edu.enterprise.advanced.io;

import java.nio.charset.Charset;

public class UTF8 {

	public static void utf8() {
		byte[] bytes = new byte[] { (byte) 0b11100101, (byte) 0b10010001, (byte) 0b10101000 };
		System.out.println(new String(bytes, Charset.forName("UTF-8")));
	}

	public static void main(String[] args) {
		utf8();
	}
}
