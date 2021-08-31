package com.linecomparison;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		int x1,y1,x2,y2;
		int p1,q1,p2,q2;
		System.out.println("Welcome to Line Comparison Problem Program");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of x1");
		x1 = s1.nextInt();
		System.out.println("Enter value of y1");
		y1 = s1.nextInt();
		System.out.println("Enter value of x2");
		x2 = s1.nextInt();
		System.out.println("Enter value of y2");
		y2 = s1.nextInt();
		
		System.out.println("Enter value of p1");
		p1=s1.nextInt();
		System.out.println("Enter value of q1");
		q1=s1.nextInt();
		System.out.println("Enter value of p2");
		p2=s1.nextInt();
		System.out.println("Enter value of q2");
		q2=s1.nextInt();
		//computation
		Double distance1=new Double(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
		Double distance2=new Double(Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1)));
		System.out.println("The distance between 2 points of Line1 is "+distance1);
		System.out.println("The distance between 2 points of Line2 is "+distance2);
		
		//comparison using equals()
		
		if(distance1.equals(distance2))
		{
			System.out.println("Lines are equal");
		}
		else
			System.out.println("Lines are not equal");
	}

}
