/**
 * @author amitpandey
 */
package hacs;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestCourse {

	Course cse870 = null;
	Course cse880 = null;
	Assignment ass1= null;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		cse870 = new Course("CSE870" , 0);
		cse880 = new Course("CSE880" , 1);
		ass1 = new Assignment("Homework 1");
	}
	

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		cse870 = null;
		cse880 = null;
		ass1= null;
	}

	/**
	 * Test method for {@link hacs.Course#AddAssignment(hacs.Assignment)}.
	 */
	@Test
	void testAddAssignment1() {
		cse870.addAssignment(ass1);
		assertTrue(cse870.assignmentList.size()==1);
	}
	
	void testtoString() {
		assertTrue(cse870.toString().equals("CSE870"));
	}
	
}
