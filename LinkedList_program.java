package collections_program;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class LinkedList_program {
	
public static void main(String[] args) {
		
	    LinkedList LL1=new LinkedList();
	    LL1.add(10);
	    LL1.add(34);
	    LL1.add("shilpa");
	    LL1.add("shilpa");
	    LL1.add(null);
	    LL1.add(10);
	    LL1.add(null);
	    LL1.add(null);
	    LL1.add(34);
	    LL1.add("BN");
		System.out.println(LL1);
		
		Iterator I1=LL1.iterator();
		 
		 while(I1.hasNext()) {
			 
			 System.out.println(I1.next());
		 }
		 
		 ListIterator i2=LL1.listIterator();
		 while(i2.hasNext())
		 {
			 //farward iteration
			 System.out.println(i2.next());
		 }
		 
		
		
	}
	

}
