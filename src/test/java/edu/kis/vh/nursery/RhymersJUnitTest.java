package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testPush() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = 4;
		rhymer.push(testValue);

		int result = rhymer.getLast();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.isEmpty();
		Assert.assertEquals(true, result);

		rhymer.push(888);

		result = rhymer.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.push(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testGetLast() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.getLast();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.push(testValue);

		result = rhymer.getLast();
		Assert.assertEquals(testValue, result);
		result = rhymer.getLast();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.push(testValue);

		result = rhymer.pop();
		Assert.assertEquals(testValue, result);
		result = rhymer.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
