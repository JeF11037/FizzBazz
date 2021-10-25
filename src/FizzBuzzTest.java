import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void lengthCoincidence() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals(100, fb.getNumbers().length);
	}
	
	@Test
	public void mupltiplesOfThree() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("fizz", fb.fizzbuzz(3));
		assertEquals("fizz", fb.fizzbuzz(27));
		assertEquals("fizz", fb.fizzbuzz(93));
	}
	
}
