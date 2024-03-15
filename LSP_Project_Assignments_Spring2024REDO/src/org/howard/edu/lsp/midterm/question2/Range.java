package org.howard.edu.lsp.midterm.question2;

/**
 * Interface representing a range of integers
 */
public interface Range {
	
	/**
	 * Checks if the range contains a specific value
	 * 
	 * @param value the value to check
	 * @return true if the range contains the value, false otherwise
	 */
	public boolean contains(int value);
	
	/**
	 * Checks if the range overlaps with another range
	 * 
	 * @param other the other range to check with for overlapping
	 * @return true if there is an overlap, false otherwise
	 */
	public boolean overlaps(Range other);
	
	/**
	 * Calculates the number of integers in the range
	 * 
	 * @return the size of the range
	 */
	public int size();

	/**
	 * Gets the lower bound of the range
	 * 
	 * @return the lower bound
	 */
	public int getLowerBound();
	
	/**
	 * Gets the upper bound of the range
	 * 
	 * @return the upper bound
	 */
	public int getUpperBound();
}
