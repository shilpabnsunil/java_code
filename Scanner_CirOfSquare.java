package basics;

import java.util.Scanner;

public class Scanner_CirOfSquare {
	public static void main(String[] args) {
		System.out.println("Enter Area value");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		
		int cir=4*a;
		System.out.println("Circumference of Square "+ cir);
		
	}

}
