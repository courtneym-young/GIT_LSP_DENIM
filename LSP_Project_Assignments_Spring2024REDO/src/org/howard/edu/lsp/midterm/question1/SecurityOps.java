package org.howard.edu.lsp.midterm.question1;

/**
 * Provides methods for text encryption
 */
public class SecurityOps {

	/**
	 * Encrypts the given text using a simple algorithm
	 * 
	 * @param text the text to be encrypted
	 * @return the encrypted text
	 */
	public static String encrypt(String text) {
		
		String cleanText = text.replaceAll("[\\s\\p{Punct}]", ""); //Remove whitespace and punctuation from the input text
		
		String evenChars = ""; //Initialize string to hold even index characters
		String oddChars = ""; //Initialize string to hold odd index characters
		
		for (int i = 0; i < cleanText.length(); i++) //Iterate through the text to separate even and odd characters
		{
			char currentChar = cleanText.charAt(i);
			if (i % 2 == 0) 
			{
				evenChars += currentChar;
			}
			else
			{
				oddChars += currentChar;
			}
		}
		
		return evenChars + oddChars; //Return the combination of even and odd characters
	}

}
