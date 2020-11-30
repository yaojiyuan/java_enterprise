package com.yjy.edu.enterprise.advanced.jni;

public class JniClass {

	static {
		System.loadLibrary("jniClass");
	}

	public native void speak(String word);

	public static native void say(String word);

	public static void main(String[] args) {
		JniClass.say("hello ");
		JniClass jniClass = new JniClass();
		jniClass.speak("China");
	}
}
