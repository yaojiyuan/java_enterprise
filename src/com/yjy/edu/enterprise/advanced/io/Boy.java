package com.yjy.edu.enterprise.advanced.io;

import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class Boy implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private int age;

	public Boy() {
		super();
	}

	public Boy(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	private void readObject(java.io.ObjectInputStream stream) throws IOException, ClassNotFoundException {
		System.out.println("call read object");
		name = stream.readUTF();
		age = stream.readInt();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws IOException {
		System.out.println("call write object");
		stream.writeUTF(name);
		stream.writeInt(age);
	}

	private Object readResolve() throws ObjectStreamException {
		System.out.println("call readResolve");
		return name;
	}

	@SuppressWarnings("unused")
	private void readObjectNoData() throws ObjectStreamException {
		System.out.println("call creadObjectNoData");

	}
}
