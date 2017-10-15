package com.unipaderborn.introducingClassesAndMethods;

public class Math {

	int a,b,c;
	
	void getadd (int x, int y){
		
		c =x +y;
		System.out.println("The output of addition of two numbers is " + c);
	}
	
	void getmultiply (int x, int y){
		
		c= x*y;
		System.out.println("The output of addition of two numbers is " + c);
		
	}
	
	
	public static void main (String [] args){
		
		Math additionObject = new Math ();
		additionObject.getadd( 20, 100);
		additionObject.getmultiply(5, 5);
		
	}
	
}
