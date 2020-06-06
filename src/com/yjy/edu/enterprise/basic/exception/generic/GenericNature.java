package com.yjy.edu.enterprise.basic.exception.generic;

import java.lang.reflect.Method;

public class GenericNature {

	public static void main(String[] args) {
		Method[] methods = GenericMethod.class.getMethods();
		for(Method method : methods){
			if(method.getName().contentEquals("speak")){
				System.out.println("参数1类型"+method.getParameters()[0].getType());
				System.out.println("参数2类型"+method.getParameters()[1].getType());
				System.out.println("返回值类型"+method.getReturnType());
			}
		}
	}
}
