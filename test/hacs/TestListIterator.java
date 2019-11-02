package hacs;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestListIterator {
	
	ArrayList<Object> myList = null;
	ListIterator myIterator = null;
	@BeforeEach
	void setUp() throws Exception {
		myList = new ArrayList<Object>();
		myList.add("Amit Pandey");
		myList.add("Abhishek");
		myList.add("Billie joe jimbob");
		myIterator = new ListIterator(myList);
	}

	@AfterEach
	void tearDown() throws Exception {
		myList = null;
		myIterator = null;
	}

	@Test
	void testHasNext() {
		assertTrue(myIterator.hasNext());
	}

	@Test
	void testNext() {
		for(int i =0; i< myList.size(); i++)
		{
			String name = (String)myList.get(i);
			assertTrue(myIterator.next().equals(name));
		}
	}

}
