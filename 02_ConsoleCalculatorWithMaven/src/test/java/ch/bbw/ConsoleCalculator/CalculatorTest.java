package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
	private Calculator testee;

	@Before
	public void setUp() {
		testee = new Calculator();
	}

	@Test
	public void testSummeZweiPositiveIsOk() {
		assertEquals(30, testee.summe(10, 20));
	}

	@Test
	public void testSummeZweiNegativeIsOk() {
		assertEquals(-30, testee.summe(-10, -20));
	}

	@Test
	public void testSummeZweiNullIsOk() {
		assertEquals(0, testee.summe(0, 0));
	}

	@Test
	public void testSummeZweiMAX_VALUEIsOk() {
		assertEquals(-2, testee.summe(Integer.MAX_VALUE, Integer.MAX_VALUE));
	}

	@Test
	public void testSummeZweiMIN_VALUEIsOk() {
		assertEquals(0, testee.summe(Integer.MIN_VALUE, Integer.MIN_VALUE));
	}

	@Test
	public void testSummeMAX_VALUEMitEinsIsOk() {
		assertEquals(-2147483648, testee.summe(Integer.MAX_VALUE, 1));
	}

	@Test
	public void testSummeMIN_VALUEMitMinusEinsIsOk() {
		assertEquals(2147483647, testee.summe(Integer.MIN_VALUE, -1));
	}

	@Test
	public void testSummeMIN_VALUEMitMAX_VALUEIsOk() {
		assertEquals(0, testee.summe(Integer.MIN_VALUE, Integer.MIN_VALUE));
	}

	@Test
	public void testSubtraktionZweiPositiveIsOk() {
		assertEquals(10, testee.subtraktion(20, 10));
	}
	
	@Test
	public void testSubtraktionZweiNegativeIsOk() {
		assertEquals(-10, testee.subtraktion(-20, -10));
	}
	
	@Test
	public void testSubtraktionZweiNullIsOk() {
		assertEquals(0, testee.subtraktion(0, 0));
	}
	
	@Test
	public void testSubtraktionZweiMAX_VALUEIsOk() {
		assertEquals(0, testee.subtraktion(Integer.MAX_VALUE, Integer.MAX_VALUE));
	}
	
	@Test
	public void testSubtraktionZweiMIN_VALUEIsOk() {
		assertEquals(0, testee.subtraktion(Integer.MIN_VALUE, Integer.MIN_VALUE));
	}
	
	@Test
	public void testSubtraktionMAX_VALUEMitEinsIsOk() {
		assertEquals(2147483646, testee.subtraktion(Integer.MAX_VALUE, 1));
	}

	@Test
	public void testSubtraktionMIN_VALUEMitMinusEinsIsOk() {
		assertEquals(-2147483647, testee.subtraktion(Integer.MIN_VALUE, -1));
	}

	@Test
	public void testSubtraktionMIN_VALUEMitMAX_VALUEIsOk() {
		assertEquals(0, testee.subtraktion(Integer.MIN_VALUE, Integer.MIN_VALUE));
	}

}
