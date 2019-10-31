package hacs;

/**
 * @author amitpandey
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Expression;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestAssignment 
{
	Assignment assign1 = null;
	Date duedate = new Date(); 
	Solution sObj = null;
	ReminderVisitor rObj = null;
	@BeforeEach
	void setUp() throws Exception {
		assign1 = new Assignment("Assignment 1");
		sObj = new Solution();
		rObj = new ReminderVisitor();
	}

	@AfterEach
	void tearDown() throws Exception {
		assign1 = null;
		sObj = null;
		rObj = null;
	}

//	@Test
//	void testSetDueDate() {
//		assign1.setDueDate(duedate);
//		//System.out.println(assign1.getDueDateString());
//		assertTrue (assign1.getDueDateString().equals("10/31/19"));
//	}


	@Test
	void testIsOverDueIf() {
		//when 
		assertTrue(!assign1.isOverDue());
	}
	
	@Test
	void testIsOverDueElse() {
		assertFalse(assign1.isOverDue());
		
	}

	@Test
	void testAddSolution() {
		try{
	        Solution myReturnedObject = assign1.addSolution();
	        assertNotNull(myReturnedObject);//check if the object is != null
	        //checks if the returned object is of class Expression
	        assertTrue(myReturnedObject instanceof Solution);
	    }catch(Exception e){
	        // let the test fail, if your function throws an Exception.
	        fail("got Exception, i want an Expression");
	     }
	}

	@Test
	void testAddSolutionSolution() {
		assign1.addSolution(sObj);
		assertTrue(assign1.getSolutionList().size()>0);
	}


	@Test
	void testToString() {
		assertTrue(assign1.toString().equals("Assignment 1"));
	}

	@Test
	void testAccept() {
		assign1.accept(rObj);
		assertTrue(rObj.m_Reminder.getSize() > 1);
	}

}
