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
	
	@Test
	public void mupltiplesOfFive() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("buzz", fb.fizzbuzz(5));
		assertEquals("buzz", fb.fizzbuzz(25));
		assertEquals("buzz", fb.fizzbuzz(85));
	}
	
	@Test
	public void mupltiplesOfThreeAndFive() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("fizzbuzz", fb.fizzbuzz(30));
		assertEquals("fizzbuzz", fb.fizzbuzz(60));
		assertEquals("fizzbuzz", fb.fizzbuzz(90));
	}
}
