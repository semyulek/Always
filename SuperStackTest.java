import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SuperStackTest {

	@Test
	void testSuperStack() {
		fail("Not yet implemented");
	}

	@Test
	void testIsEmpty() {
		// create an empty stack and check if it is empty
		SuperStack<Integer> stack = new SuperStack<>(1);
		boolean result = stack.isEmpty();
		assertTrue(result);

		stack.push(new Integer(9));
		result = stack.isEmpty();
		assertFalse(result);

		// add a few elements and check if empty
	}

	@Test
	void testIsFull() {
		fail("Not yet implemented");
	}

	@Test
	void testPush() {
		fail("Not yet implemented");
	}

	@Test
	void testPop() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
