/*
 * Name: Courtney Young
 */
package org.howard.edu.lsp.assignment2;

public class NumericUtils {

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

}
