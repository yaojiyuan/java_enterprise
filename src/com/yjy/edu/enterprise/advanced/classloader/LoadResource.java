package com.yjy.edu.enterprise.advanced.classloader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LoadResource {

	public static void main(String[] args) throws IOException {
		String resName = "com/yjy/edu/enterprise/advanced/classloader/hello.txt";
		try (InputStream stream = LoadResource.class.getClassLoader().getResourceAsStream(resName)) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
			System.out.println(reader.readLine());
		}
	}
	
}
