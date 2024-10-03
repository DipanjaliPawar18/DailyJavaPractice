package com.javaBasics;

import java.util.Scanner;

public class PtrintTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		System.out.println("Table by for loop : ");
		for(int i=1; i<=10; i++) {
			System.out.println(n*i);
		}
		
		System.out.println();
		System.out.println("Table by while loop : ");
		int i =1;
		while(i<=10){
			System.out.println(n*i);
			i++;
		}
		
		sc.close();
	}
}