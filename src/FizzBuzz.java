import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class FizzBuzz {
		
	public int[] getNumbers() {
		int[] numbers = new int[100];
		for (int tick = 0; tick < numbers.length; tick++) {
			numbers[tick] = tick + 1;
		}
		return numbers;
	}
	
}
