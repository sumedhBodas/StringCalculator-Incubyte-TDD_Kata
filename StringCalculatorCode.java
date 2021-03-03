import java.util.Arrays;

public class StringCalculatorCode {
	
	public int Add(String input)
	{
		if (input.length() == 0)
		{
			return 0;
		}
 
		return Arrays.stream(input.split("[,\n]"))
				.map(String::strip)
				.mapToInt(Integer::parseInt)
				.filter(n -> n < 1001)
				.peek(n -> {
					if (n < 0) throw new IllegalArgumentException ("Negativesnot allowed: " + n);
				})
				.sum();
	}

}
