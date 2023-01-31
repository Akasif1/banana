package Modifier;

import org.junit.Test;

public class D extends A{
	@Test
	public void testOne() {
		m1();
		m2();
		m3();
		m4();// private is not possible from same package using inheritance 
	}
	
	@Test
	public void anyName() {
		A x = new A();
		x.setA(17);
		System.out.println(x.getA());
		x.setA(24);
		System.out.println(x.getA());
	}

}
