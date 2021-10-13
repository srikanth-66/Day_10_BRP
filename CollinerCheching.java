package com.homeworkprograms;

import java.util.Scanner;

public class CollinerCheching 
{
	public static boolean isColliner(int x1, int y1, int x2,int y2, int x3, int y3)
	{
        int a = x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2);
     
        if (a == 0)
            System.out.println("Yes");
        else
            System.out.println("No");

		return true;
		
	}
	public static void main(String[] args) 
	{
		System.out.println("in Colliner we need check the given three points lie on the same line or not");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the x-intercept values x1,x2,x3");
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		int x3=sc.nextInt();
		System.out.println("enter the y-intercept values y1,y2,y3");
		int y1=sc.nextInt();
		int y2=sc.nextInt();
		int y3=sc.nextInt();
		boolean result=isColliner(x1, y1,x2,y2,x3,y3);
		if(result=true)
			System.out.println("the given points lies on the same line therefore it is colliner");	
	}
}
