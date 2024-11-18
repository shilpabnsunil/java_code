package collections_program;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Vector;

public class LinkedHashSet_program {
	
public static void main(String[] args) {
		
	    LinkedHashSet LHS1=new LinkedHashSet();
	    LHS1.add(10);
	    LHS1.add(34);
	    LHS1.add("shilpa");
	    LHS1.add("shilpa");
	    LHS1.add(null);
	    LHS1.add(10);
	    LHS1.add(null);
	    LHS1.add(null);
	
	    LHS1.add(34);
	    LHS1.add("BN");
		System.out.println(LHS1);
		
		Iterator I1=LHS1.iterator();
		 
		 while(I1.hasNext()) {
			 
			 System.out.println(I1.next());
		 }
	
	}

}
