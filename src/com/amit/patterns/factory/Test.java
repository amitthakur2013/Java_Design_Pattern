package com.amit.patterns.factory;

public class Test {

	public static void main(String[] args) {
		PizzaStore ps=new PizzaStore();
		
		ps.orderPizza("veg");
		ps.orderPizza("cheese");
		
		

	}

}
