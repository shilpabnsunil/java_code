package basics;

import java.util.Scanner;

public class Scanner_AreaOfRectangle {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Length and Breath");
		Scanner s1=new Scanner(System.in);
		int l=s1.nextInt();
		int b=s1.nextInt();
		int Area=l*b;
		System.out.println("Area of rectangle "+Area);
		
		}
}
