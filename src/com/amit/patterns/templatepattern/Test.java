package com.amit.patterns.templatepattern;

public class Test {

	public static void main(String[] args) {
		DataRenderer renderer = new XMLDataRenderer();
		renderer.render();
		DataRenderer renderer2 = new CSVDataRenderer();
		renderer2.render();
	}

}
