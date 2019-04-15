package polymorphism;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculationTest {

	@Test
	void test() {
		Calculator poly = new Calculator();
		
		int result = poly.add(5, 5);
		assertEquals(10,result);
		
		int re = poly.add(5, 5, 5);
		assertEquals(15,re);
		
		double res = poly.add(5.1, 5.2, 5.3);
		assertEquals(15.6,res);
	}

}
