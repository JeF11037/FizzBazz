import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void lengthCoincidence() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals(100, fb.getNumers().length);
	}
	
	@Test
	public void mupltiplesOfThree() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("fizz", fb.fizzbuzz(3));
	}

}
