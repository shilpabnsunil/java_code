package basics;

import java.util.Scanner;

public class Scanner_CircumferenceOfCircle {
	
	static float pi=3.14f;
	public static void main(String[] args) {
		System.out.println("Enter radius value");
		Scanner s1=new Scanner(System.in);
		int r=s1.nextInt();
		float cir=2*pi*r;
		System.out.println("Circumference of Circle "+ cir);
		
	}
	

}
