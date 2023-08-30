package com.tnsif.dayfive;

import java.util.Scanner;

public class ArrayAverageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] array=new int[16];
		System.out.println("Enter the elements:");
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
			
		}
		int sum=0;
		for(int num:array)
		{
			sum+=num;
		}
		double average=sum/array.length;
		System.out.println("Array elements: ");
		for(int num:array)
		{
			System.out.println(num+" ");
		}
	    System.out.println();
		System.out.println("Average:" +average);
		
		

	}

}
