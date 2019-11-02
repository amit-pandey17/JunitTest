package hacs;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSolution {
	Solution s = null;
	@BeforeEach
	void setUp() throws Exception {
		s = new Solution();
		s.theGrade = 99;
	}

	@AfterEach
	void tearDown() throws Exception {
		s = null;
	}

	@Test
	void testToString1() {
		s.reported = true;
		assertFalse(s.toString().contains("not"));
	}
	
	@Test
	void testToString2() {
		s.reported = false;
		assertTrue(s.toString().contains("not"));

	}
	
	@Test
	void testGetGradeString1() {
		s.reported = true;
		s.getGradeString().equals("99");
	}
	
	@Test
	void testGetGradeString2() {
		s.reported = false;
		s.getGradeString().equals("-1");

	}


	@Test
	void testGetGradeInt() {
		assertTrue(s.getGradeInt() == 99);
	}

	@Test
	void testIsReported1() {
		s.setReported(true);
		assertTrue(s.isReported());
	}	
	
	@Test
	void testIsReported2() {
		s.setReported(false);
		assertFalse(s.isReported());

		
	}

}

