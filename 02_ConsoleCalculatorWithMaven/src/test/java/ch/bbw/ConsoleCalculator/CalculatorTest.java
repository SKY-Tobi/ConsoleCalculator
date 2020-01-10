package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
		assertEquals(-1, testee.summe(Integer.MIN_VALUE, Integer.MAX_VALUE));
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
		assertEquals(1, testee.subtraktion(Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	@Test
	public void testDivisionZweiPositiveIsOk() {
		assertEquals(2, testee.division(20, 10), 0);
	}

	@Test
	public void testDivisonZweiNegativeIsOk() {
		assertEquals(2, testee.division(-20, -10), 0);
	}

	@Test
	public void testDivisionZweiNullArithmeticException() {
		assertThrows(ArithmeticException.class, () -> testee.division(0, 0));
	}

	@Test
	public void testDivisionZweiMAX_VALUEIsOk() {
		assertEquals(1, testee.division(Integer.MAX_VALUE, Integer.MAX_VALUE), 0);
	}

	@Test
	public void testDivisionZweiMIN_VALUEIsOk() {
		assertEquals(1, testee.division(Integer.MIN_VALUE, Integer.MIN_VALUE), 0);
	}

	@Test
	public void testDivisionMAX_VALUEMitEinsIsOk() {
		assertEquals(2.147483647E9, testee.division(Integer.MAX_VALUE, 1), 0);
	}

	@Test
	public void testDivisionMIN_VALUEMitMinusEinsIsOk() {
		assertEquals(-2.147483648E9, testee.division(Integer.MIN_VALUE, -1), 0);
	}

	@Test
	public void testDivisionMIN_VALUEMitMAX_VALUEIsOk() {
		assertEquals(-1, testee.division(Integer.MIN_VALUE, Integer.MAX_VALUE), 0);
	}

	@Test
	public void testDoubleInBinaryStringPositiveIsOk() {
		assertEquals("100000000101000000000000000000000000000000000000000000000000000", testee.doubleInBinär(12.0));
	}

	@Test
	public void testDoubleInBinaryStringNegativeIsOk() {
		assertEquals("1100000000101000000000000000000000000000000000000000000000000000", testee.doubleInBinär(-12.0));
	}

	@Test
	public void testDoubleInBinaryStringPositiveDecimalIsOk() {
		assertEquals("100000000101000001111101111100111011011001000101101000011100101", testee.doubleInBinär(12.123));
	}

	@Test
	public void testDoubleInBinaryStringNegativeDecimalIsOk() {
		assertEquals("1100000000101000001111101111100111011011001000101101000011100101", testee.doubleInBinär(-12.123));
	}

	@Test
	public void testDoubleInBinaryStringNullIsOk() {
		assertEquals("0", testee.doubleInBinär(0));
	}

	@Test
	public void testDoubleInBinaryStringMIN_VALUEMitMinusEinsIsOk() {
		assertEquals("1100000111100000000000000000000000000000000000000000000000000000",
				testee.doubleInBinär(Integer.MIN_VALUE));
	}

	@Test
	public void testDoubleInBinaryStringMIN_VALUEMitMAX_VALUEIsOk() {
		assertEquals("100000111011111111111111111111111111111110000000000000000000000",
				testee.doubleInBinär(Integer.MAX_VALUE));
	}

	@Test
	public void testDoubleInBinaryStringNullNullpointerException() {
		assertThrows(NullPointerException.class, () -> testee.doubleInBinär((Double) null));
	}

	// Testdaten von der aufgabe genommen:
	// https://www.frustfrei-lernen.de/mathematik/zinseszins.html
	@Test
	public void testZinsesZinsIsOk() {
		assertEquals(1459.98, testee.zinsesZins(1200, 4, 5), 0);
	}

	@Test
	public void testZinsesZinsWenigerAls1JahrIsOk() {
		assertEquals(1204.72, testee.zinsesZins(1200, 4, 0.1), 0);
	}

	@Test
	public void testZinsesZinsZinsist100ProzentIsOk() {
		assertEquals(2400, testee.zinsesZins(1200, 100, 1), 0);
	}
	
	@Test
	public void testZinsesZinsZinsistMinus100ProzentIsOk() {
		assertEquals(0, testee.zinsesZins(1200, -100, 1), 0);
	}

	@Test
	public void testZinsesZinsMinus1JahrIsOk() {
		assertEquals(600, testee.zinsesZins(1200, 100, -1), 0);
	}
	
	@Test
	public void testZinsesZinsKapitalist0IsOk() {
		assertEquals(0, testee.zinsesZins(0, 4, 5), 0);
	}
	
	@Test
	public void testZinsesZinsZinsist0IsOk() {
		assertEquals(1200, testee.zinsesZins(1200, 0, 5), 0);
	}
	
	@Test
	public void testZinsesZinsJahrist0IsOk() {
		assertEquals(1200, testee.zinsesZins(1200, 4, 0), 0);
	}
}
