package org.howard.edu.lsp.midterm.question2;

public class IntegerRange implements Range{

	private int lowerBound;
	private int upperBound;
	
	public IntegerRange(int lowerBound, int upperBound)
	{
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	@Override
	public int getLowerBound()
	{
		return lowerBound;
	}
	
	@Override
	public int getUpperBound()
	{
		return upperBound;
	}
	
	@Override
	public boolean contains(int value)
	{
		return value >= lowerBound && value <= upperBound;
	}
	
	@Override
	public boolean overlaps(Range other)
	{
		return !(this.upperBound < other.getLowerBound() || this.lowerBound > other.getUpperBound());
	}
	
	@Override
	public int size()
	{
		return upperBound - lowerBound + 1;
	}

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
