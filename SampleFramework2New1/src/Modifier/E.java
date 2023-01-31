package Modifier;

import org.junit.Test;

import Modifier1.C;

public class E extends C{
	@Test
	
	public void testTwo() {
		// m1(); default not possible from different package using inheritance
		
		m2();
		m3();
		// m4(); private is not possiable from different package using inheritance
	}

}
