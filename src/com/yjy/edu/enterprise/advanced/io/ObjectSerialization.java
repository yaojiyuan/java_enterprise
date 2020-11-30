package com.yjy.edu.enterprise.advanced.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class ObjectSerialization {

	@SuppressWarnings("unchecked")
	public static void writeAndReadObject() throws Exception {
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(bs);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "111");
		out.writeObject(map);
		ByteArrayInputStream is = new ByteArrayInputStream(bs.toByteArray());
		ObjectInputStream in = new ObjectInputStream(is);
		map = (HashMap<String, String>) in.readObject();
		System.out.println(map.get("1"));
	}

	public static void writeAndReadObjectOverride() throws Exception {
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(bs);
		Teacher teacher = new Teacher("周星驰", 48);
		out.writeObject(teacher);
		ByteArrayInputStream is = new ByteArrayInputStream(bs.toByteArray());
		ObjectInputStream in = new ObjectInputStream(is);
		teacher = (Teacher) in.readObject();
		System.out.println(teacher.getName());
	}

	public static void readResolve() throws Exception {
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(bs);
		Boy boy = new Boy("甜瓜", 48);
		out.writeObject(boy);
		ByteArrayInputStream is = new ByteArrayInputStream(bs.toByteArray());
		ObjectInputStream in = new ObjectInputStream(is);
		String name = (String) in.readObject();
		System.out.println(name);
	}

	public static void readAndWriteExternalizable() throws Exception {
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(bs);
		Student student = new Student("李白", 18);
		out.writeObject(student);
		ByteArrayInputStream is = new ByteArrayInputStream(bs.toByteArray());
		ObjectInputStream in = new ObjectInputStream(is);
		student = (Student) in.readObject();
		System.out.println(student.getName());
	}

	public static void main(String[] args) throws Exception {
		writeAndReadObject();
		writeAndReadObjectOverride();
		readAndWriteExternalizable();
		readResolve();
	}
}
