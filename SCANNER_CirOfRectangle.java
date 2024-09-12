package basics;

import java.util.Scanner;

public class SCANNER_CirOfRectangle {
	
	public static void main(String[] args) {
		System.out.println("Enter length and breath value");
		Scanner s1=new Scanner(System.in);
		int l=s1.nextInt();
		int b=s1.nextInt();
		float cir=2*(l+b);
		System.out.println("Circumference of Rectangle "+ cir);
		
	}

}
