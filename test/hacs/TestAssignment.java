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


//	@Test
//	void testIsOverDueIf() {
//		//when 
//		assertTrue(assign1.isOverDue());
//	}
//	
//	@Test
//	void testIsOverDueElse() {
//		assertFalse(assign1.isOverDue());
//	}
//
	@Test
	void testAddSolution() {
		try{
			Solution soln = assign1.addSolution();
			//If addSolution returns an empty object then its values should be same as sObj after
			//initialization
			assertTrue(sObj.theAuthor.equals(soln.theAuthor),"addSolution passed!");
			assertTrue(sObj.SolutionFileName.equals(soln.SolutionFileName),"Equal");
			assertTrue(sObj.theGrade == soln.theGrade, "Also equals");
			assertTrue(sObj.reported == soln.reported, "Also also equals");
//			assertTrue(sObj.theSubmitData == soln.theSubmitData,"Also equals");
			
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

}
