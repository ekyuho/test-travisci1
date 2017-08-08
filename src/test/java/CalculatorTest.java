import static org.junit.Assert.*;
import org.junit.Test;


public class CalculatorTest {

	@Test
	public void test() {
		Calculator c = new Calculator();
		assertEquals(3, c.sum(1, 2));
	}

}
