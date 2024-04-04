package org.howard.edu.lsp.assignment5;

import org.howard.edu.lsp.assignment5.IntegerSetException;

public class Driver {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    try {
	      // declare and initialize first set
	      IntegerSet s1 = new IntegerSet();
	      for (int i = 1; i <= 5; i++) {
	        s1.add(i);
	      }

	      // test toString(), smallest(), and largest()
	      System.out.println("Value of Set1 is: " + s1.toString());
	      System.out.println("Smallest value in Set1 is: " + s1.smallest());
	      System.out.println("Largest value in Set1 is: " + s1.largest() + "\n");

	      // test remove()
	      System.out.println("Remove 2 from Set1.");
	      s1.remove(2);
	      System.out.println("New value of Set1 is: " + s1.toString() + "\n");

	      System.out.println("Remove 5 from Set1.");
	      s1.remove(5);
	      System.out.println("New value of Set1 is: " + s1.toString() + "\n");

	      // test isEmpty()
	      System.out.println("Set1 is empty (True or False).");
	      System.out.println(s1.isEmpty() + "\n");

	      // test contains()
	      System.out.println("Set1 contains 4 (True or False).");
	      System.out.println(s1.contains(4) + "\n");

	      // test length()
	      System.out.println("Length of Set1: " + s1.length() + "\n");

	      // test clear()
	      System.out.println("Clear set.");
	      s1.clear();
	      System.out.println("Value of Set1 is: " + s1.toString() + "\n");

	      // Re-add elements
	      for (int i = 1; i <= 5; i++) {
	        s1.add(i);
	      }

	      // declare and initialize second set
	      IntegerSet s2 = new IntegerSet();
	      for (int i = 2; i <= 14; i += 2) {
	        s2.add(i);
	      }

	      // test union()
	      System.out.println("Union of Set1 and Set2");
	      s1.union(s2);
	      System.out.println(s1.toString() + "\n");

	      // clear set 1 and set 2
	      s1.clear();
	      s2.clear();

	      // Re-add elements in set 1 and set 2
	      for (int i = 1; i <= 5; i++) {
	        s1.add(i);
	      }

	      for (int i = 2; i <= 14; i += 2) {
	        s2.add(i);
	      }

	      // test diff() s1 - s2
	      System.out.println("Difference of Set1 and Set2");
	      s1.diff(s2);
	      System.out.println(s1.toString() + "\n");

	      // clear set 1 and set 2
	      s1.clear();
	      s2.clear();

	      // Re-add elements in set 1 and set 2
	      for (int i = 1; i <= 5; i++) {
	        s1.add(i);
	      }

	      for (int i = 2; i <= 14; i += 2) {
	        s2.add(i);
	      }

	      // test diff() s2 - s1
	      System.out.println("Difference of Set1 and Set2");
	      s2.diff(s1);
	      System.out.println(s2.toString() + "\n");

	      // clear set 1 and set 2
	      s1.clear();
	      s2.clear();

	      // Re-add elements in set 1 and set 2
	      for (int i = 1; i <= 5; i++) {
	        s1.add(i);
	      }

	      for (int i = 2; i <= 14; i += 2) {
	        s2.add(i);
	      }

	      // test intersect()
	      System.out.println("Intersection of Set1 and Set2");
	      s1.intersect(s2);
	      System.out.println(s1.toString() + "\n");

	      // clear set 1 and set 2
	      s1.clear();
	      s2.clear();

	      // Re-add elements in set 1 and set 2
	      for (int i = 1; i <= 5; i++) {
	        s1.add(i);
	      }

	      for (int i = 2; i <= 14; i += 2) {
	        s2.add(i);
	      }

	      // test complement()
	      System.out.println("Complement of Set1");
	      s1.complement(s2);
	      System.out.println(s1.toString() + "\n");

	      // clear set 1 and set 2
	      s1.clear();
	      s2.clear();

	      // Re-add elements in set 1 and set 2
	      for (int i = 1; i <= 5; i++) {
	        s1.add(i);
	      }

	      for (int i = 2; i <= 14; i += 2) {
	        s2.add(i);
	      }

	      // test equals()
	      System.out.println("Are Set1 and Set2 equal?");
	      System.out.println(s1.equals(s2) + "\n");

	      // Test catching the exception
	      s1.clear();
	      s1.largest();

	    } catch (IntegerSetException m) {
	      System.out.println(m);
	    }
	  }
}
