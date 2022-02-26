package com.amit.patterns.adaptorfactory;

public class DaoFactoryProducer {
	public static DaoAbstractFactory produce(String factoryType) {
		DaoAbstractFactory daf = null;
		
		if(factoryType.equals("xml")) {
			daf = new XmlDaoFactory();
		} else if(factoryType.equals("db")) {
			daf= new DbDaoFactory();
		}
		
		return daf;
	}
}
