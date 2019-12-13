package ch.bbw.ConsoleCalculator;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class AppTest {

	public AppTest() {

	}

	@Nested
	class Suite {

		@Test
		void testApp() {
			JUnitCore junit = new JUnitCore();
			Result result = junit.run(CalculatorTest.class);
			if (result.wasSuccessful()) {

			} else {
				for (Failure failure : result.getFailures()) {
					fail(failure.getException());
				}
			}
		}

	}

}
