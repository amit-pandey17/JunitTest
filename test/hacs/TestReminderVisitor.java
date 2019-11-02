package hacs;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestReminderVisitor {

	ReminderVisitor rv = null;
	Facade f =null;
	Course c = null;
	Assignment a = null;
	
	@BeforeEach
	void setUp() throws Exception {
		rv = new ReminderVisitor(new Reminder());
		f = new Facade();
		f.createCourseList();
		
		c = new Course("CSE870", 0);
		
		a = new Assignment("Homework");
		a.setDueDate(new Date());
		}

	@AfterEach
	void tearDown() throws Exception {
		rv=null;
	}

	@Test
	void testVisitFacade() {
		rv.visitFacade(f);
		assertFalse(f.theCourseList.isEmpty());
	}

	@Test()
	void testVisitCourse() {
		rv.visitCourse(c);
		assertTrue(c.assignmentList.isEmpty());
	}

	@Test
	void testVisitAssignment() {
		rv.visitAssignment(a);
		assertTrue(rv.m_Reminder.listOverdue.getRows() > 0);
	}
}