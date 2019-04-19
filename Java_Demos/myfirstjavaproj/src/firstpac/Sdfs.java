package firstpac;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Sdfs {

	@BeforeEach
	public void setUp() throws Exception {
	    System.out.println("Executing a new test");
	}
	
	@Test
	void testHello() {
		 System.out.println("testhello");
		 return;
	}
	
	@Test
	void testcalc() {
		MyFirstClass x = new MyFirstClass();
		assertEquals(2, x.add(1, 1));
		assertEquals(116, x.add(78, 38));
		assertEquals(1, x.mult(1, 1));
		assertEquals(54, x.mult(6, 9));
	}

}
