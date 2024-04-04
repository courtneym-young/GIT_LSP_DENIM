package org.howard.edu.lsp.assignment5;

/**
 * Developed a custom error that prints the string its passed
 */
public class IntegerSetException extends Exception {
  /**
   * Prints out error message
   * 
   * @param message String to print 
   */
  public IntegerSetException(String message) {
    super(message);
  }
}
