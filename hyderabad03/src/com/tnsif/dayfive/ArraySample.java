package com.tnsif.dayfive;

import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		System.out.println("Enter the size of the array=");
		
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		
		int[] arr=new int[100];
		System.out.println("Enter the elements of the array=");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Here is the array:");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
