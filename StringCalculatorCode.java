import java.util.Arrays;

public class StringCalculatorCode {
	
	public int Add(String input)
	{
		StringBuilder CustomRegex = new StringBuilder("\\n,");
		StringBuilder output = new StringBuilder();
		
		if (input.startsWith("//"))
		{
			CustomRegex.append(input, input.indexOf("//"), input.indexOf("\n"));
			output.append(input.substring(input.indexOf("\n")).trim());
		} 
		else 
		{
			output.append(input);
		}
 				
		return Arrays.stream(output.toString().split("[" + CustomRegex + "]"))
			.map(String::strip)
			.filter(j -> !j.isBlank())
			.mapToInt(Integer::parseInt)
			.filter(n -> n < 1001)
			.peek(n -> 
			{
				if (n < 0) throw new IllegalArgumentException ("Negativesnot allowed: " + n);
			}).sum();  
				
	}

}
