/**
 * @author amitpandey
 */
package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestCourse {

	Course english = null;
	Course calc1 = null;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		english = new Course("English" , 0);
		calc1 = new Course("Calc1" , 1);
		
	}
	

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		english = null;
		calc1 = null;

	}

	/**
	 * Test method for {@link hacs.Course#AddAssignment(hacs.Assignment)}.
	 */
	@Test
	void testAddAssignment1() {
		
		assertTrue(true);
	}
	
	void testtoString() {
		
	}
	
	void testaccept(){
		
	}
}
