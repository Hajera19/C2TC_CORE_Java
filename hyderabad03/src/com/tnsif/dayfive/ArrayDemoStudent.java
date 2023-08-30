package com.tnsif.dayfive;

public class ArrayDemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr=new Student[5];
		
		
		arr[0]=new Student(1,"hajera");
		arr[1]=new Student(2,"fu");
		arr[2]=new Student(3,"do");
		arr[3]=new Student(4,"jera");
		arr[4]=new Student(5,"haj");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element at  "+1"="+arr[i].getrollno[]+"+arr[i].getName()");
		}





	}

}
