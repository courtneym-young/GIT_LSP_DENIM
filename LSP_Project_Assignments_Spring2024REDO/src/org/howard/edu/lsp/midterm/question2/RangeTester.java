package org.howard.edu.lsp.midterm.question2;

/**
 * A class to test the functionality of IntegerRange
 */
public class RangeTester {

	public static void main(String[] args) {
		//create two integer ranges
		IntegerRange range1 = new IntegerRange(1, 10);
		IntegerRange range2 = new IntegerRange(5, 15);
		
		//Testing contains method
		System.out.println("Does range1 contain 5? " + range1.contains(5));
		System.out.println("Does range1 contain 15? " + range1.contains(15));
		
		//Testing overlaps method
		System.out.println("Do range1 and range2 overlap? " + range1.overlaps(range2));
		
		//Testing size method
		System.out.println("Size of range1: " + range1.size());
		
		//Testing equals method
		IntegerRange range3 = new IntegerRange(1, 10);
		System.out.println("Are range1 and range3 equal? " + range1.equals(range3));

	}

}
