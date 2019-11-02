package hacs;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFacade {
	
	Facade f = null;
	UserInfoItem us= null;
	UserInfoItem ui = null;
	Person studentpepe = null;
	@BeforeEach
	void setUp() throws Exception {
		f = new Facade();
		us = new UserInfoItem();
		us.strUserName = "pepe";
		us.UserType = UserInfoItem.USER_TYPE.Student;
		
		ui = new UserInfoItem();
		ui.strUserName = "Inst1";
		ui.UserType = UserInfoItem.USER_TYPE.Instructor;
		
		Person studentpepe = new Student();
		studentpepe.UserName = "pepe";
		studentpepe.type = 0;
		f.thePerson = studentpepe;
	}

	@AfterEach
	void tearDown() throws Exception {
		f = null;
		ui= null;
		us= null;
		studentpepe = null;

	}

//	@Test
//	void testReportSolutions() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	@Test
//	void testSubmitSolution() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	@Test
//	void testRemind() {
//		fail("Not yet implemented"); // TODO
//	}

	@Test
	void testCreateUser1() {
		f.createUser(ui);
		assertTrue(f.thePerson instanceof Instructor); 
	}
	
	@Test
	void testCreateUser2() {
		f.createUser(us);
		assertTrue(f.thePerson instanceof Student); 
	}


	@Test
	void testCreateCourseList() {
		f.createCourseList();
		assertFalse(f.theCourseList.isEmpty());
	}

	@Test
	void testAttachCourseToUser() {
		f.createCourseList();
		f.attachCourseToUser();
        assertFalse(f.thePerson.CourseList.isEmpty());
	}
}

