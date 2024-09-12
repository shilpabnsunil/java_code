package basics;

import java.util.Scanner;

public class Scanner_AreaOfSquare {
	public static void main(String[] args) {
		
		System.out.println("Enter a value");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int Area=a*a;
		System.out.println("Area of square "+Area);
		
		
	}

}
