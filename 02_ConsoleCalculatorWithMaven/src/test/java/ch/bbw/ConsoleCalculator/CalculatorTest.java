package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{	
	private Calculator testee;
	
	@Before
	public void setUp() {
		testee = new Calculator();
	}
    @Test
    public void testSummeZweiPositiveIsOk()
    {
    	assertEquals(30, testee.summe(10, 20));
    }
    @Test
    public void testSummeZweiNegativeIsOk()
    {
    	assertEquals(-30, testee.summe(-10, -20));
    }
    @Test
    public void testSummeZweiNullIsOk()
    {
    	assertEquals(0, testee.summe(0, 0));
    }
    @Test
    public void testSummeZweiMAX_VALUEIsOk()
    {
    	assertEquals(-2, testee.summe(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }
    @Test
    public void testSummeZweiMIN_VALUEIsOk()
    {
    	assertEquals(0, testee.summe(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}
