package com.linecomparison;

import java.util.Scanner;

class Line {
	int x1, y1, x2, y2, p1, q1, p2, q2;

	Line(int x1, int y1, int x2, int y2, int p1, int q1, int p2, int q2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.p1 = p1;
		this.q1 = q1;
		this.p2 = p2;
		this.q2 = q2;
	}

	/*
	 * calculating distance using math function comparing two lines using
	 * compareTo()
	 */
	public void compareLines() {
		Double distance1 = new Double(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
		Double distance2 = new Double(Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1)));
		
		System.out.println("Distance between two points of line1 is " + distance1);
		System.out.println("Distance between two points of line2 is " + distance2);
		
		//comparison using equal()
		if(distance1.equals(distance2))
			System.out.println("Both lines are equal");
		else
			System.out.println("Both lines are not equal");

		// comparison using compareTo()
		int res = distance1.compareTo(distance2);
		if (res > 0)
			System.out.println("Line1 is greater than Line2");
		else if (res < 0)
			System.out.println("Line1 is smaller than Line2");
		else
			System.out.println("Both lines are equal");

	}

}


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
		
		Line line = new Line(x1, y1, x2, y2, p1, q1, p2, q2);
		line.compareLines();
		
	}

}
