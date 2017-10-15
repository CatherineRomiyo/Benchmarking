package com.unipaderborn.introducingClassesAndMethods;

public class Math {

	int a,b,c;
	
	void getadd (int x, int y){
		
		c =x +y;
		System.out.println(c);
	}
	
	void getmultiply (int x, int y){
		
		c= x*y;
		System.out.println(c);
		
	}
	
	
	public static void main (String [] args){
		
		Math additionObject = new Math ();
		additionObject.getadd( 20, 100);
		additionObject.getmultiply(5, 5);
		
	}
	
}

hello