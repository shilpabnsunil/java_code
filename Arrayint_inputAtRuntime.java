package array_program;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayint_inputAtRuntime {
	public static void main(String[] args) {
		
		
		Scanner s1=new Scanner(System.in);
		int rolln0[]=new int[4];
		
		for(int i=0;i<4;i++) 
		{
		
		rolln0[i]= s1.nextInt();
		
		}
		System.out.println(Arrays.toString(rolln0));
	}

}
