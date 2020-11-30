package com.yjy.edu.enterprise.advanced.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {

	public static interface Box {

		void pack();
	}

	public static class BoxInvocationHandler implements InvocationHandler {

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			if (method.getName().equals("pack")) {
				System.out.println("proxy the pack method");
			}
			return null;
		}

	}

	public static void main(String[] args) {
		Class<?> proxyClass = Proxy.getProxyClass(Thread.currentThread().getContextClassLoader(),
				new Class[] { Box.class });
		System.out.println(Box.class.isAssignableFrom(proxyClass));
		Box box = (Box) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
				new Class[] { Box.class }, new BoxInvocationHandler());
		System.out.println(box.getClass().getName());
		box.pack();
	}

}
