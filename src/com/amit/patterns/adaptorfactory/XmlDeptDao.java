package com.amit.patterns.adaptorfactory;

public class XmlDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Department to XML");
	}

}
