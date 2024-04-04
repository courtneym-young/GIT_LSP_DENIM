package org.howard.edu.lsp.assignment5;

import org.howard.edu.lsp.assignment5.IntegerSetException;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.*;

public class IntegerSetTest {
	
	private IntegerSet my_set;
	
	@BeforeEach
	public void setUp() throws Exception {
		my_set = new IntegerSet();
	}
	
	@AfterEach
	public void tearDown() throws Exception {
		my_set = null;
	}
	
	//testClear()
	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		my_set.add(1);
		my_set.clear();
		assertEquals(my_set.length(), 0);
	}
	
	//testLength()
	@Test
	@DisplayName("Test case for length")
	public void testLength() {
		my_set.add(5);
		my_set.add(10);
		my_set.add(15);
		assertEquals(3, my_set.length());
	}
	
	//testEquals()
	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		IntegerSet other_set = new IntegerSet();
		my_set.add(5);
		other_set.add(5);
		assertTrue(my_set.equals(other_set));
	}
	
	//testContains()
	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		my_set.add(20);
		assertTrue(my_set.contains(20));
	}
	
	//testLargest()
	@Test
	@DisplayName("Test case for largest")
	public void testLargest() throws IntegerSetException {
		my_set.add(2);
		my_set.add(4);
		my_set.add(6);
		my_set.add(8);
		my_set.add(10);
		assertTrue(my_set.largest() == 10);
	}
	
	@Test
	@DisplayName("Test case for largest exception")
	public void testLargestException() {
		assertThrows(IntegerSetException.class, () -> my_set.largest());
	}
	
	//testSmallest()
	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() throws IntegerSetException {
		my_set.add(5);
		my_set.add(10);
		my_set.add(15);
		my_set.add(20);
		my_set.add(25);
		assertTrue(my_set.smallest() == 5);
	}
	
	@Test
	@DisplayName("Test case for smallest exception")
	public void testSmallestException() {
		assertThrows(IntegerSetException.class, () -> my_set.smallest());
	}
	
	//testAdd()
	@Test
	@DisplayName("Test case for add")
	public void testAdd() {
		my_set.add(3);
		assertTrue(my_set.contains(3));
	}
	
	//testRemove()
	@Test
	@DisplayName("Test case for remove")
	public void testRemove() {
		my_set.add(1);
		my_set.add(2);
		my_set.add(3);
		my_set.remove(3);
		assertFalse(my_set.contains(3));
	}
	
	//testUnion()
	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		IntegerSet other_set = new IntegerSet();
		my_set.add(2);
		other_set.add(4);
		my_set.union(other_set);
		assertTrue(my_set.contains(2));
		assertTrue(my_set.contains(4));
	}
	
	//testIntersect()
	@Test
	@DisplayName("Test case for intersect")
	public void testIntersect() {
		IntegerSet other_set = new IntegerSet();
		my_set.add(2);
		my_set.add(4);
		other_set.add(4);
		other_set.add(6);
		my_set.intersect(other_set);
		assertTrue(my_set.contains(4));
		assertFalse(my_set.contains(2));
		assertFalse(my_set.contains(6));
	}
	
	//testDiff()
	@Test
	@DisplayName("Test case for diff")
	public void testDiff() {
		IntegerSet other_set = new IntegerSet();
		my_set.add(5);
		my_set.add(10);
		other_set.add(10);
		other_set.add(15);
		my_set.diff(other_set);
		assertTrue(my_set.contains(5));
		assertFalse(my_set.contains(10));
		assertFalse(my_set.contains(15));
	}
	
	//testComplement()
	@Test
	@DisplayName("Test case for complement")
	public void testComplement() {
		IntegerSet other_set = new IntegerSet();
		my_set.add(1);
		my_set.add(3);
		other_set.add(3);
		other_set.add(5);
		my_set.complement(other_set);
		assertTrue(my_set.contains(3));
		assertFalse(my_set.contains(1));
		assertFalse(my_set.contains(5));
	}
	
	//testIsEmpty()
	@Test
	@DisplayName("Test case for isEmpty")
	public void testIsEmpty() {
		assertTrue(my_set.isEmpty());
		my_set.add(3);
		assertFalse(my_set.isEmpty());
	}
	
	//testToString()
	@Test
	@DisplayName("Test case for toString")
	public void testToString() {
		my_set.add(2);
		my_set.add(4);
		assertEquals("[2, 4]", my_set.toString());
	}

}
