package org.howard.edu.lsp.assignment5;

import java.util.*;
import org.howard.edu.lsp.assignment5.IntegerSetException;

/**
 * Represents a set of integers.
 * Provides methods for manipulating integer elements in the set.
 */
public class IntegerSet {

  /**
   * Storing the set elements in an ArrayList
   */
  private List<Integer>set = new ArrayList<Integer>();

  /**
   * Default Constructor
   */
  public IntegerSet() {

  }

  /**
   * Class constructor
   * 
   * @param set to be initialized
   */
  public IntegerSet(ArrayList<Integer>set) {
    this.set = set;
  }

  /**
   * Clears the internal representation of the set using the ArrayList function clear()
   */
  public void clear() {
    set.clear();
  };

  /**
   * Returns the length of the set
   * 
   * @return integer which represents the length of the list
   */
  public int length() {
    return set.size();
  };

  /**
   * Checks if two sets are equal
   * 
   * @param Object to compare the original set to
   * 
   * @return true if the two sets are equal, false otherwise
   */
  public boolean equals(Object o) {
    if (o instanceof IntegerSet)
    {
      IntegerSet x = (IntegerSet) o; //cast object to IntegerSet

      if(set.size() != x.set.size())
      {
        return false;
      }
      else
      {
        return set.containsAll(x.set);
      }
    }

    return false;
  };

  /**
   * Tests whether an integer is present in the set
   * 
   * @param value integer to check
   * 
   * @return true if present, otherwise false
   */
  public boolean contains(int value) {
    return set.contains(value);
  };

  /**
   * Returns the largest integer item in the set
   * 
   * @return integer that represents the smallest value in the set
   * 
   * @throws IntegerSetException custom exception instance
   */
  public int largest() throws IntegerSetException{ //NEED TO ADDRESS THIS ERROR!
    if (set.isEmpty())
    {
      throw new IntegerSetException("Set is empty.");
    }
    else
    {
      int max = Integer.MIN_VALUE;
      for (int value : set)
      {
        if (value > max)
        {
          max = value;
        }
      }

      return max;
    }
  }; 

  /**
   * Returns the smallest integer item in the set
   * 
   * @return integer that represents the smallest value in the set
   * 
   * @throws IntegerSetException custom exception instance
   */
  public int smallest() throws IntegerSetException{ //NEED TO ADDRESS THIS ERROR!
    if (set.isEmpty())
    {
      throw new IntegerSetException("Set is empty.");
    }
    else
    {
      int min = Integer.MAX_VALUE;
      for (int value : set)
      {
        if (value < min)
        {
          min = value;
        }
      }

      return min;
    }
  };

  /**
   * Adds an item to the set if it is not already present
   * 
   * @param item integer to check
   */
  public void add(int item) {
    if (set.contains(item) == false)
    {
      set.add(item);
    }	
  }; 


  /**
   * Removes an item from the set if it is present
   * 
   * @param item integer to check
   */
  public void remove(int item) {
    if (set.contains(item) == true)
    {
      set.remove(set.indexOf(item));
    }
  }; 

  /**
   * Computes the union of all unique elements from two sets
   * 
   * @param intSetb the set to be combined with the original set
   */
  public void union(IntegerSet intSetb) {
    for (Integer element : intSetb.set)
    {
      if (!set.contains(element))
      {
        set.add(element);
      }
    }
  };

  /**
   * Computes the intersection of all the elements in two sets
   * 
   * @param intSetb the set to be intersected with the original set
   */
  public void intersect(IntegerSet intSetb) {
    set.retainAll(intSetb.set);
  }; 

  /**
   * Calculates the difference of two sets
   * 
   * @param intSetb the set to be subtracted from the original set
   */
  public void diff(IntegerSet intSetb) {
    set.removeAll(intSetb.set);
  }; 

  /**
   * Find the complement of the original set 
   * 
   * @param intSetb the set used to find elements not in the original set
   */
  public void complement(IntegerSet intSetb) {
    List<Integer>complement = new ArrayList<Integer>(intSetb.set);
    complement.removeAll(set);
    set = complement;
  }

  /**
   * Checks whether the set is empty
   * 
   * @return true if empty, false otherwise
   */
  public boolean isEmpty() {
    return set.isEmpty();
  }; 


  /**
   * Prints all integer elements in the set
   * 
   * @return string representation of the set
   */
  public String toString() {
    String result ="[";
    for (int i = 0; i < set.size(); i++)
    {
      result += set.get(i);
      if (i < set.size() - 1)
      {
        result += ", ";
      }
    }
    result += "]";
    return result;
  };	

}
