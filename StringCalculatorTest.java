import static org.junit.Assert.assertThrows;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	//Test if throws illegal argument exception
	void addTest() {
		assertThrows(IllegalArgumentException.class, () -> {StringCalculator.add("-1,5");});

	}
	
	//Test if ignores numbers over 1000
	void addTest2() {
		assertEquals(1, StringCalculator.add("1, 1000"));
	}
}
