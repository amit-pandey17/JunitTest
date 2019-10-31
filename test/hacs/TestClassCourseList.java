package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClassCourseList {
	
	ClassCourseList ccl = null;

	@BeforeEach
	void setUp() throws Exception {
		ccl = new ClassCourseList();
	}

	@AfterEach
	void tearDown() throws Exception {
		ccl = null;
	}

	@Test
	void testInitializeFromFile() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testFindCourseByCourseName() {
		fail("Not yet implemented"); // TODO
	}

}
