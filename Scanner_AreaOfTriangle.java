package basics;

import java.util.Scanner;

public class Scanner_AreaOfTriangle {
	public static void main(String[] args) {
		System.out.println("Enter breath and height of triangle");
		Scanner s1=new Scanner(System.in);
		int b=s1.nextInt();
		int h=s1.nextInt();
		double Area=0.5*b*h;
		System.out.println("Area of Triangle "+Area);
		
	}

}
