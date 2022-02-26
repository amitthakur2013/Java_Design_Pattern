package com.amit.patterns.adaptorfactory;

public class Test {
	public static void main(String args[]) {
		DaoAbstractFactory daf= DaoFactoryProducer.produce("xml");
		Dao dao=daf.createDao("emp");
		dao.save();
		
		DaoAbstractFactory daf2= DaoFactoryProducer.produce("db");
		Dao dao2=daf2.createDao("emp");
		dao2.save();
	}
}
