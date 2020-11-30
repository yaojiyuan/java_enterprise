package com.yjy.edu.enterprise.advanced.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyAop {

	public static interface Box {

		void pack();
	}

	 // 这个类是由A实现的
	public static class BoxImpl implements Box {

		public void pack() {
			System.out.println("pack");
		}
	}

	public static class BoxWrapperInvocationHandler implements InvocationHandler {

		private Box box;

		private BoxWrapperInvocationHandler(Box box) {
			this.box = box;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			if (method.getName().equals("pack")) {
				// 这里打印日志增强的逻辑是由B写的
				System.out.println("call method pack");
				box.pack();
			}
			return null;
		}

	}

	public static void main(String[] args) {
		BoxWrapperInvocationHandler invocationHandler = new BoxWrapperInvocationHandler(new BoxImpl());
		Box box = (Box) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
				new Class[] { Box.class }, invocationHandler);
		box.pack();
	}

}
