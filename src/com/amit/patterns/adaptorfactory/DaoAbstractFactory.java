package com.amit.patterns.adaptorfactory;

public abstract class DaoAbstractFactory {
	public abstract Dao createDao(String type);
}
