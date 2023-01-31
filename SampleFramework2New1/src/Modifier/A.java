package Modifier;

import org.junit.Test;

public class A {
	// protected and private is not possible
	//class c all access modifier is possible
	
	void m1(){
		
	}
	void m2() {
		
	}
	void m3() {
		
	}
	void m4() {
		
	}
	private int a = 7;
	public int getA() {
		return a;
		
	}
	
	public void setA(int a) {
		this.a=a;
	}
}

class M {
	//under same source file only default is possible 
}