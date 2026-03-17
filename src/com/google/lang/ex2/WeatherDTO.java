package com.google.lang.ex2;

public class WeatherDTO {

	private String cityName;
	private int gion;
	private double humidity;

	public String getCityName() {
		return cityName;
	}

	public int getGion() {
		return gion;
	}

	public void setGion(int gion) {
		this.gion = gion;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println(this.getCityName());
		return "";
	}

}