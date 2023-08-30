package com.tnsif.dayfive;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,23,53,87,45,98,03,56,24};
		System.out.println("Entered Array is=");
		
		for(int num:arr)
		{
			System.out.println(num+" ");
		}
		Arrays.sort(arr);
		System.out.println("Here is your sorted array:");
		
		for(int num:arr)
		{
			System.out.println(num+" ");
		}
		System.out.println("Length of the array arr is="+arr.length);

	}

}
