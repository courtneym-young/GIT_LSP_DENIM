package org.howard.edu.lsp.midterm.question1;

public class Driver {

	public static void main(String[] args) {
		// Test the encrypt method
		String input = "I love CSCI363";
		String encryption = SecurityOps.encrypt(input);
		System.out.println("Encrypted text: " + encryption);
	}

}
