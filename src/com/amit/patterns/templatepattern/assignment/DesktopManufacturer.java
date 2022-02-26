package com.amit.patterns.templatepattern.assignment;

public class DesktopManufacturer extends ComputerManufacturer {

	@Override
	public String addHardDisk() {
		return "Desktop Hard Disk";
	}

	@Override
	public String addRam() {
		return "Desktop RAM";
	}

	@Override
	public String addKeyboard() {
		return "Desktop Keyboard";
	}

}
