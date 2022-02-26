package com.amit.patterns.templatepattern.assignment;

public abstract class ComputerManufacturer {

	public void buildComputer() {
		System.out.println(addHardDisk()+addRam()+addKeyboard());
	}

	public abstract String addHardDisk();

	public abstract String addRam();
	
	public abstract String addKeyboard();
}
