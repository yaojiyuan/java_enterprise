package com.yjy.edu.enterprise.advanced.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class NIOBuffer {

	public static void bufferProperties() {
		CharBuffer buffer = CharBuffer.allocate(12);
		System.out.println("buffer limit = " + buffer.limit());
		System.out.println("buffer capacity = " + buffer.capacity());
		System.out.println("buffer position = " + buffer.position());
	}

	public static void operateBuffer() {
		CharBuffer buffer = CharBuffer.allocate(12);
		buffer.put( 'h');  //position 被变更到1
		buffer.put(2, 'l');
		buffer.put(3, 'w');
		buffer.put(1, 'e');
		System.out.println(buffer.get(3)); 
		System.out.println(buffer.get());
		buffer.mark();
		System.out.println(buffer.get());
		buffer.reset();
		System.out.println(buffer.get());
		buffer.limit(5);
		buffer.put(4,'r');
		buffer.compact();
		System.out.println(buffer.position());
		buffer.flip();
		System.out.println(buffer.limit());
	}
	
	public static void  createBuffer() {
		CharBuffer buffer = CharBuffer.allocate(5);
		CharBuffer.wrap(new char[5]);
		CharBuffer.wrap("hello");
		CharBuffer slice = buffer.slice(); 
		System.out.println(slice.capacity());
		ByteBuffer.allocateDirect(10);
	}

	public static void main(String[] args) {
		bufferProperties();
		createBuffer();
		operateBuffer();
	}

}
