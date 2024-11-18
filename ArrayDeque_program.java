package collections_program;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayDeque_program {
	
public static void main(String[] args) {
		
	    ArrayDeque AD1=new ArrayDeque();
	    AD1.add(10);
	    AD1.add(34);
	    AD1.add("shilpa");
	    AD1.add("shilpa");
	    AD1.add(10);
	    AD1.add(34);
	    AD1.add("BN");
	   
		System.out.println(AD1);
		
		Iterator I1=AD1.iterator();
		 
		 while(I1.hasNext()) {
			 
			 System.out.println(I1.next());
		 }
		 
		
		 
		
		
	}

}
