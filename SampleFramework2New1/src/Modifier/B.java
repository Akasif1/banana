package Modifier;

import Modifier1.C;

public class B {
	public static void main(String [] args) {
		A x = new A();
		
		x.m4(); // private is not accessible in same package using object creation
		
		C y = new C();
		
		y.m2(); // we can see only public from different package using object creation
				
	}

}
