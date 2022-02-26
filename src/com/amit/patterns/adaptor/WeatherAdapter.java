package com.amit.patterns.adaptor;

public class WeatherAdapter {
	public int findTemperature(int zipcode) {
		String city=null;
		
		if(zipcode == 123456) {
			city="Persia";
		}
		WeatherFinder weatherFinder = new WeatherFinderImpl();
		int temperature = weatherFinder.find(city);
		
		return temperature;
	}
}
