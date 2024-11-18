package array_program;

import java.util.Arrays;

public class COpy1array_to_anotherarray_reverseorder {
	public static void main(String[] args) {
		
		int array1[]=new int[4];
		array1[0]=21;
		array1[1]=34;
		array1[2]=42;
		array1[3]=56;
		
		int array2[]=new int[4];
		
		for(int i=0,k=3;i<array1.length;i++) {
			
			array2[k]=array1[i];
			k--;
		}
		//toString is used to convert any thing into string
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
	
	}

}
