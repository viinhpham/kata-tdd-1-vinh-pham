package org.vinh.kata.tdd;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Vinh Pham
 * @since 9/20/15.
 */
@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

	private static Calculator calculator;

	@BeforeClass
	public static void setUp(){
		calculator = Calculator.getInstance();
	}
	@AfterClass
	public static void tearDown(){
		calculator = null;
	}

	@Test
	public void testGetInstanceShouldBeNotNullWithoutInitiate() throws Exception {
		assertNotNull(Calculator.getInstance());
	}

	@Test
	public void testAddShoutReturnZeroWhenStringIsEmpty() throws Exception {
		assertEquals(0, calculator.add(""));
	}
	@Test
	public void testAddShoutReturnZeroWhenStringIsNull() throws Exception {
		assertEquals(0, calculator.add(null));
	}
	@Test
	public void testAddShouldReturnResultWhenLengthParamIsOne() throws Exception{
		assertEquals(1,calculator.add("1"));
	}
	@Test(expected = NumberFormatException.class)
	public void testAddShouldReturnResultWhenParamIsString() throws Exception{
		calculator.add("a");
	}
	@Test
	 public void testAddShouldReturnResult() throws Exception{
		assertEquals(3,calculator.add("1,2"));
	}
}