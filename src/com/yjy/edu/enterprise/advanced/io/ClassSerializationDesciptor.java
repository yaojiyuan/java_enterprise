package com.yjy.edu.enterprise.advanced.io;

import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;

public class ClassSerializationDesciptor {

	public static void main(String[] args) {
		ObjectStreamClass osc = ObjectStreamClass.lookup(Teacher.class);
		ObjectStreamField[] fields = osc.getFields();
		System.out.print("需要序列化的字段有:");
		for (ObjectStreamField field : fields) {
			System.out.print(field.getName() + " ");
		}
		System.out.println();
		long serialVersionUID = osc.getSerialVersionUID();
		System.out.println("serialVersionUID=" + serialVersionUID);
	}
}
