package basics;

import java.util.Scanner;

public class Scanner_AreaOfCircle {
		
	static double pi=3.14;
	public static void main(String[] args) {
		System.out.println("enter the radius of circle");
		Scanner s1=new Scanner(System.in);
		
		int r=s1.nextInt();
		double area=pi*r*r;
		System.out.println("area of circle is "+area);
		//s1.nextDouble();
	}
}
