package com.amit.patterns.adaptorfactory;

public class DbDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Emp to XML");
	}

}
