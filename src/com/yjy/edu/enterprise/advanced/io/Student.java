package com.yjy.edu.enterprise.advanced.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Student implements Externalizable, Serializable {

	private String name;

	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("call write external");
		out.writeUTF(name);
		out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("call read external");
		name = in.readUTF();
		age = in.readInt();
	}

}
