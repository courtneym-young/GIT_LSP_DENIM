/*
 * Name: Courtney Young
 */
package org.howard.edu.lsp.assignment2;

import java.io.*;
import java.util.*;

public class WordCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "src/org/howard/edu/lsp/assignment2/words.txt"; //Relative path for file
		HashMap<String, Integer> wordCounts = new HashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = br.readLine()) != null) {
				line = line.replaceAll("\\p{Punct}", " "); //Replace all punctuation with whitespace
				String[] words = line.split("[\\s+]"); //Split line into words using whitespace as delimiter
				for (String word : words) {
					word = word.replaceAll("[^a-zA-Z']", "").toLowerCase(); //Remove non-letter characters and convert to lowercase
					if (word.length() > 3 && !NumericUtils.isNumeric(word)) { //Ignore trivial words and numeric strings
						wordCounts.put(word,  wordCounts.getOrDefault(word, 0) + 1);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Number of times each word appears in the text file:"); //Echo the input file
		
		for (HashMap.Entry<String, Integer> entry : wordCounts.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
