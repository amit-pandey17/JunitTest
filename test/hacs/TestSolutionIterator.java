package hacs;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSolutionIterator {

	SolutionList sl = null;
	Solution sol1 = null;
	Solution sol2 = null;
	SolutionIterator sI = null;
	@BeforeEach
	void setUp() throws Exception {
    sl = new SolutionList();
    sol1 = new Solution();
    sol2 = new Solution();
    sl.add(sol1);
    sl.add(sol2);
    sI = new SolutionIterator(sl);
	
	}

	@AfterEach
	void tearDown() throws Exception {
			sl = null;
			sol1 = null;
			sol2= null;
			sI = null;
	}

	

	@Test
	void testHasNext() {
		assertTrue(sI.hasNext());
	}

	@Test
	void testNext() {
		assertTrue(sI.next()!= null);
	}
}



