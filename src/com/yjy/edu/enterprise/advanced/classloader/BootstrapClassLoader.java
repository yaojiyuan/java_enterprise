package com.yjy.edu.enterprise.advanced.classloader;

import java.net.URL;

public class BootstrapClassLoader {

	public static void main(String[] args) {
		//这里会打印null
		System.out.println(int.class.getClassLoader());
		URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
		for (URL url : urls) {
			System.out.println(url);
		}
	}
}
