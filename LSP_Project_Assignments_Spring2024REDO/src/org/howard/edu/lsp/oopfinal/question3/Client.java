package org.howard.edu.lsp.oopfinal.question3;

public class Client {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape circle = sf.createShape("circle");
		circle.draw();
		Shape rectangle = sf.createShape("rectangle");
		rectangle.draw();
	}

}
