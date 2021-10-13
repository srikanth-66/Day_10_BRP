package com.classworkprograms;

import java.util.Scanner;

public class ArrayMinMaxValue
{
	static int temp;
	public static int minArray(int [] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[0]>arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}
			}
		}
		return temp;
		
	}
	 public static int maxArray(int[] arr, int n) 
	 {
		 for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(arr[0]<arr[i])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;		
					}
				}

				
			}
			return temp;

		
	}
	public static void displayArray(int [] array,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the integer array");
		int size=sc.nextInt();
		int [] array=new int[size];
		int n=array.length;
		System.out.println("enter the array elemnts");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		displayArray(array, n);
		System.out.println("min value of array is"+minArray(array,n));
		System.out.println("max value of array is"+maxArray(array,n));
	}	
}
