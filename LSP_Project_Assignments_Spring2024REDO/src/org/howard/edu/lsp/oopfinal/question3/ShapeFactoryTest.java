package org.howard.edu.lsp.oopfinal.question3;

import org.junit.Test;
import org.junit.Assert;

public class ShapeFactoryTest {
	
	@Test
	public void testCreateCircle() {
		ShapeFactory sf = new ShapeFactory();
		Shape shape = sf.createShape("circle");
		Assert.assertTrue(shape instanceof Circle);
	}
	
	@Test
	public void testCreateRectangle() {
		ShapeFactory sf = new ShapeFactory();
		Shape shape = sf.createShape("rectangle");
		Assert.assertTrue(shape instanceof Rectangle);
	}
	
	@Test
	public void testCreateUnknownShape() {
		ShapeFactory sf = new ShapeFactory();
		sf.createShape("triangle");
	}
}
