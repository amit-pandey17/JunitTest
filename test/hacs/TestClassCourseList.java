package hacs;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

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
	//read the given files
	void testInitializeFromFile() {
		ccl.initializeFromFile("CourseInfo.txt");
		assertTrue(ccl.size()>1);
	}

	@Test
	void testFindCourseByCourseName() {
		ccl.initializeFromFile("CourseInfo.txt");
		assertTrue(ccl.findCourseByCourseName("CSE870").CourseName.equals("CSE870"));
		assertTrue(ccl.findCourseByCourseName("CSE880").CourseName.equals("CSE880"));
		assertTrue(ccl.findCourseByCourseName("CSE890").CourseName.equals("CSE890"));

	}

}
