package com.yjy.edu.enterprise.advanced.mthread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ThreadLocalVariant {

	public static void main(String[] args) {
		//通过ThreadLocal来传参
		LocaleHolder.set(Locale.CHINESE);
		Date date = new Date();
		System.out.println(printDate(date, "yyyy-MM-dd E"));
		LocaleHolder.set(Locale.ENGLISH);
		System.out.println(printDate(date, "yyyy-MM-dd E"));
	}

	public static String printDate(Date date, String pattern) {
		Locale locale = LocaleHolder.get();
		DateFormat format = new SimpleDateFormat(pattern, locale);
		return format.format(date);
	}

	public static class LocaleHolder {
		private static ThreadLocal<Locale> tls = new ThreadLocal<Locale>();

		public static void set(Locale l) {
			tls.set(l);
		}

		public static Locale get() {
			return tls.get();
		}
	}
}
