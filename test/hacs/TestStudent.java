package hacs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStudent {
	Course cse870 = null;
	Course cse880 = null;
	Assignment ass1= null;
	Student stud = null;
	
	@BeforeEach
	void setUp() throws Exception {
		cse870 = new Course("CSE870" , 0);
		cse880 = new Course("CSE880" , 1);
		ass1 = new Assignment("Homework 1");
		stud = new Student();

	}

	@AfterEach
	void tearDown() throws Exception {
		cse870 = null;
		cse880 = null;
		ass1= null;
		stud = null;
	}

	@Test
	void testCreateCourseMenu() {
		assertEquals(null, stud.createCourseMenu(cse870, 0));
		assertEquals(null, stud.createCourseMenu(cse880, 1));
	}

}

