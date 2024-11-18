package collections_program;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class HashSet_program {
	
public static void main(String[] args) {
		
	     HashSet HS1=new HashSet();
	     HS1.add(10);
	     HS1.add(34);
	     HS1.add("shilpa");
	     HS1.add("shilpa");
	     HS1.add(null);
	     HS1.add(10);
	     HS1.add(null);
	     HS1.add(null);
	     HS1.add(34);
	     HS1.add("BN");
		System.out.println(HS1);
		
		Iterator I1=HS1.iterator();
		 
		 while(I1.hasNext()) {
			 
			 System.out.println(I1.next());
		 }
		 
		 
}
}
