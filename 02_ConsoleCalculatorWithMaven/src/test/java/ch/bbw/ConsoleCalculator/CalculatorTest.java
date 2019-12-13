package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.assertTrue;

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
    public void testSummeZweiPositive()
    {
        assertTrue(testee.summe(10, 20) == 30 );
    }
    @Test
    public void testSummeZweiNegative()
    {
    	assertTrue(testee.summe(-10, -20) == -30 );
    }
    @Test
    public void testSummeZweiNull()
    {
    	assertTrue(testee.summe(0, 0) == 0 );
    }
}
