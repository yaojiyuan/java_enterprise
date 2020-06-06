package com.yjy.edu.enterprise.basic.oop.classes;

public class Street {

	private int provinceCode;

	private int cityCode;

	private int streetCode;

	public Street(int provinceCode, int cityCode, int streetCode) {
		this.provinceCode = provinceCode;
		this.cityCode = cityCode;
		this.streetCode = streetCode;
	}

	public int getProvinceCode() {
		return provinceCode;
	}

	public int getCityCode() {
		return cityCode;
	}

	public int getStreetCode() {
		return streetCode;
	}

	public void setProvinceCode(int provinceCode) {
		this.provinceCode = provinceCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cityCode;
		result = prime * result + provinceCode;
		result = prime * result + streetCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Street other = (Street) obj;
		return cityCode == other.cityCode && provinceCode == other.provinceCode && streetCode == other.streetCode;
	}

}
