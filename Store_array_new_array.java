package array_program;

import java.util.Arrays;

public class Store_array_new_array {
	
	public static void main(String[] args) {
		
		
		int array1[]= {2,4,6,8,10};
		
		
		int array2[] = new int[5];
		
		for(int i=0,k=4;i<array1.length;i++) {
			
			array2[k]=array1[i];
			k--;
		}
		//toString is used to convert any thing into string
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
	
	}

}
