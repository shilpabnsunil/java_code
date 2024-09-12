package basics;

import java.util.Scanner;

public class Scanner_AreaOfTripezium {
	
	public static void main(String[] args) {
		
		System.out.println("Enter length1,lenth2 and height value");
		Scanner s1=new Scanner(System.in);
		
		int l1=s1.nextInt();
		int l2=s1.nextInt();
		int h=s1.nextInt();
		double Area=0.5*(l1+l2)*h;
		System.out.println("Area of Tripezium "+Area);
		
	}

}
