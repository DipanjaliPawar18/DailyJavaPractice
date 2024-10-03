package com.javaBasics;

import java.util.Scanner;

public class CalculatorWithInput {

	public static void main(String[] args) {
		// create object of Scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Addition of the numbers : " + (num1+num2));
		System.out.println("Difference of the numbers : " + (num1-num2));
		System.out.println("Multiplication of the numbers : " + (num1*num2));
		System.out.println("Division of the numbers : " + (num1/num2));
		
		sc.close();
	}
}