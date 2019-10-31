package hacs;

/**
 * @author amitpandey
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestAssignment 
{
	Assignment assign1 = null;
	Date duedate = new Date(); 

	@BeforeEach
	void setUp() throws Exception {
		assign1 = new Assignment();
	}

	@AfterEach
	void tearDown() throws Exception {
		assign1 = null;
	}

	@Test
	void testSetDueDate() {
		assign1.setDueDate(duedate);
		//System.out.println(assign1.getDueDateString());
		assertTrue (assign1.getDueDateString().equals("10/30/19"));
	}

	@Test
	void testSetAssSpec() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testIsOverDue() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testAddSolution() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testAddSolutionSolution() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testSubmitSolution() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testGetSolutionList() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testGetSolution() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testGetSugSolution() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testGetSolutionIterator() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testToString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testGetDueDateString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testAccept() {
		fail("Not yet implemented"); // TODO
	}

}
