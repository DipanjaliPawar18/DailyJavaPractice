package com.javaBasics;

public class First { // class declaration 

	public static void main(String[] args) { // main method
		// In java the program execution starts from the main method only		
		// Print statement in java
		System.out.println("Hello Java");
		
		// Data types 
		/*
		In java there are mainly two types of variables
		** Primitive - Predefined (int,float,char,long,double,short,boolean,byte)
		** Non primitive - user defined (Array, String, Object, classes etc.)
		*/
		
		int num = 14; // range from -2^31 to 2^31 -1
		float f = 12.5f; // single precision 32 bit
		double d = 457.68d; //double precision 64 bit
		boolean isGood = true; // true or false
		byte b = 34;// range -128 to 127
		short s = 567; // range from -32768 to 38767
		long l = 56587932987L;// range from -2^63 to 2^63 -1
		char c = 'A'; //all the characters
		
		System.out.println("int : " + num);
		System.out.println("long : " + l);
		System.out.println("short : " + s);
		System.out.println("byte : " + b);
		System.out.println("char : " + c);
		System.out.println("boolean : " + isGood);
		System.out.println("float : " + f);
		System.out.println("double : " + d);
	}
}