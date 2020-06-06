package com.yjy.edu.enterprise.basic.enums;

public enum GenderV2 implements AutoCloseable {

	MAIL("男") {
		@Override
		public String display() {
			return "MAIL";
		}
	},
	FEMAIL("女") {
		@Override
		public String display() {
			return "FEMALE";
		}
	};

	private String cnName;

	GenderV2(String cnName) {
		this.cnName = cnName;
	}

	public String getCnName() {
		return cnName;
	}

	@Override
	public void close() throws Exception {
		System.out.println("close");
	}

	public abstract String display();
}
