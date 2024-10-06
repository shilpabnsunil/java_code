package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment41 {
	
	public static void main(String[] args) {
		try {
			Scanner s1=new Scanner(System.in);
			System.out.println("Please Enter ur age");
			int age=s1.nextInt();
			
		}
		catch(InputMismatchException a) {
			System.out.println("sorry incorrect input");
			Scanner s1=new Scanner(System.in);
			System.out.println("Please Enter ur age");
			int age=s1.nextInt();
		}
	}

}
