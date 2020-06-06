package com.yjy.edu.enterprise.basic.enums;

public enum Gender {

	MALE("男"), FEMALE("女");

	private String cnName;

	Gender(String cnName) {
		this.cnName = cnName;
	}

	public String getCnName() {
		return cnName;
	}
}
