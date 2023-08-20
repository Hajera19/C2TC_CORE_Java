package com.tnsif;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of terms:");
		int n =sc.nextInt();
		
		System.out.println("Fibonacci series:");
		
		int firstTerm = 0,secondTerm = 1;
		
		for(int i=1;i<=n;i++) {
			System.out.println(firstTerm +" ");
			
			int nextTerm=firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		
		sc.close();

	}

}
