package org.howard.edu.lsp.midterm.question2;

/**
 * Represents a range of integers
 */
public class IntegerRange implements Range{

	private int lowerBound;
	private int upperBound;
	
	/**
	 * Constructs and IntegerRange with the specified lower and upper bounds
	 * 
	 * @param lowerBound the lower bound of the range
	 * @param upperBound the upper bound of the range
	 */
	public IntegerRange(int lowerBound, int upperBound)
	{
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	/**
	 * Gets the lower bound of the range
	 * 
	 * @return the lower bound
	 */
	@Override
	public int getLowerBound()
	{
		return lowerBound;
	}
	
	/**
	 * Gets the upper bound of the range
	 * 
	 * @return the upper bound
	 */
	@Override
	public int getUpperBound()
	{
		return upperBound;
	}
	
	/**
	 * Checks if the range contains a specific value
	 * 
	 * @param value the value to check
	 * @return true if the range contains the value, false otherwise
	 */
	@Override
	public boolean contains(int value)
	{
		return value >= lowerBound && value <= upperBound;
	}
	
	/**
	 * Checks if the range overlaps with another range
	 * 
	 * @param other the other range to check with for overlapping
	 * @return true if there is an overlap, false otherwise
	 */
	@Override
	public boolean overlaps(Range other)
	{
		return !(this.upperBound < other.getLowerBound() || this.lowerBound > other.getUpperBound());
	}
	
	/**
	 * Calculates the number of integers in the range
	 * 
	 * @return the size of the range
	 */
	@Override
	public int size()
	{
		return upperBound - lowerBound + 1;
	}

	/**
	 * Compares the range to a specified object
	 * 
	 * @param obj the object to compare with
	 * @return true if the objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null || getClass() != obj.getClass())
		{
			return false;
		}
		IntegerRange other = (IntegerRange) obj;
		return lowerBound == other.lowerBound && upperBound == other.upperBound;
	}
}
