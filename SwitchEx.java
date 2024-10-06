package com.javaBasics;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number :");
		int num2 = sc.nextInt();
		System.out.println("Enter the number of button : ");
		int button = sc.nextInt();
		
		switch(button) {
		case 1 : System.out.println("Addition : " + (num1+num2));
		break;
		case 2 : System.out.println("Substraction : " + (num1-num2));
		break;
		case 3 : System.out.println("Multiplication : " + (num1*num2));
		break;
		case 4 : System.out.println("Division : " + (num1/num2));
		break;
		case 5 : System.out.println("Modulo : " + (num1%num2));
		break;
		default : System.out.println("Enter valid button!!!");
		}
		
		sc.close();
	}
}