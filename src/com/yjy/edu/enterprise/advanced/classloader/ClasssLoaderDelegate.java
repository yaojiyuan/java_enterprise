package com.yjy.edu.enterprise.advanced.classloader;

import java.net.URL;

public class ClasssLoaderDelegate {

	public static void main(String[] args) throws Exception {
		URL url = Thread.currentThread().getContextClassLoader().getResource("");
		MyClassLoader classLoader = new MyClassLoader(new URL[] { url });
		//这里并不会打印”Speaker loaded“，因为加载后并没有连接和初始化
		Class<?> speakerClass = classLoader.loadClass("com.yjy.edu.enterprise.advanced.classloader.Speaker");
		//这里会打印false
		System.out.println(speakerClass == Speaker.class);
		speakerClass.newInstance();
		new Speaker();
		classLoader.close();
	}

}
