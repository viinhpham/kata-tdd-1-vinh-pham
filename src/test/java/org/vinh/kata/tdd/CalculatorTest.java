package org.vinh.kata.tdd;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Vinh Pham
 * @since 9/20/15.
 */
@RunWith(JUnit4.class)
public class CalculatorTest {

	@Test
	public void testGetInstanceShouldBeNotNullWithoutInitiate() throws Exception {
		assertNotNull(Calculator.getInstance());
	}

	@Test
	public void testAdd() throws Exception {

	}
}