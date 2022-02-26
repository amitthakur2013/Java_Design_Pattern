package com.amit.patterns.adaptorfactory;

public class DBEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Dept to DB");
	}

}
