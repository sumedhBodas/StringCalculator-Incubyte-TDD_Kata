import static org.junit.Assert.*;
import org.junit.Test;

public class StringCalculatorTestCases {

	StringCalculatorCode sol = new StringCalculatorCode();
	
	@Test
	public void EmptyString_returnzZero()
	{
		assertEquals(sol.Add(""), 0);
	}
}
