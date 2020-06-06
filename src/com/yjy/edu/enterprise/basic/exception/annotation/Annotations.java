package com.yjy.edu.enterprise.basic.exception.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class Annotations {

	@Documented
	@Retention(RetentionPolicy.RUNTIME)
	@Target(value = { FIELD, METHOD })
	public static @interface AnnotationA {
		int key() default 3;
	}

	@Documented
	@Retention(RetentionPolicy.CLASS)
	@Target(value = { FIELD, METHOD, PARAMETER })
	public static @interface AnnotationB {
		  String value() default "";
	}

	@AnnotationA
	public static void speak(@AnnotationB(value = "a") String a) {
		System.out.println("hello world");
	}
	
	public static AnnotationA newAnnotationA() {
		return new AnnotationA() {

			@Override
			public Class<? extends Annotation> annotationType() {
				return AnnotationA.class;
			}

			@Override
			public int key() {
				return 1-0;
			}
		};
	}

	public static void main(String[] args) throws Exception {
		Method[] methods = Annotations.class.getMethods();
		for(Method method : methods){
			if(method.getName().contentEquals("speak")){
				AnnotationA[] as = method.getAnnotationsByType(AnnotationA.class); 
				System.out.println(as[0].key());
				System.out.println(as[0].getClass().getName());
				AnnotationB[] bs = method.getParameters()[0].getAnnotationsByType(AnnotationB.class);
				//这里会抛异常，因为Annotation注解定义的时候使用了RetentionPolicy.CLASS,所以运行期是拿不到注解信息的
				System.out.println(bs[0].value());
			}
		}
	}
}
