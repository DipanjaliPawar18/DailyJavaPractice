package com.javaBasics;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		
		if(age < 18 && age > 0) {
			System.out.println("Sorry you can't vote..!");
		} else if(age >= 18){
			System.out.println("Go ahead to give your priceless vote..!");
		} else {
			System.out.println("Enter valid age!!!");
		}
		sc.close();
	}
}