package com.juaracoding.driver;

public class DriverStrategyImplementator {
	
	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case "chrome":
			return new Chrome();

		default:
			return null;
		}
	}

}
