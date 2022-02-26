package com.amit.patterns.templatepattern.assignment;

public class Test {

	public static void main(String[] args) {
		ComputerManufacturer cm=new DesktopManufacturer();
		cm.buildComputer();
		ComputerManufacturer cm2=new LaptopManufacturer();
		cm2.buildComputer();

	}

}
