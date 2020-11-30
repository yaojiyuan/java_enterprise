package com.yjy.edu.enterprise.advanced.classloader;

import java.net.URL;
import java.net.URLClassLoader;

public class MyClassLoader extends URLClassLoader {

	public MyClassLoader(URL[] urls) {
		super(urls);
	}

	@Override
	protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
		if (name.startsWith("com.yjy")) {
			System.out.println("load class " + name);
			return findClass(name);
		}
		return super.loadClass(name, resolve);
	}

}
