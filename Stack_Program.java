package collections_program;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class Stack_Program {
	
public static void main(String[] args) {
		
	    Stack st1=new Stack();
	    st1.add(10);
	    st1.add(34);
	    st1.add("shilpa");
	    st1.add("shilpa");
	    st1.add(null);
	    st1.add(10);
	    st1.add(null);
	    st1.add(null);
	    st1.add(34);
	    st1.add("BN");
		System.out.println(st1);
		
		Iterator I1=st1.iterator();
		 
		 while(I1.hasNext()) {
			 
			 System.out.println(I1.next());
		 }
		 
		 ListIterator i2=st1.listIterator();
		 while(i2.hasNext())
		 {
			 //farward iteration
			 System.out.println(i2.next());
		 }
		 
		 //enumeration used for legacy classes
		 Stack b1=new Stack();
		 b1.add(12);
		 b1.add(23);
		 b1.add(43);
		 b1.add(87);
		 
		 System.out.println(b1);
		//2 methods of enumeration are hasMoreElements and nextElements
		 Enumeration e1=b1.elements();		
		 while(e1.hasMoreElements())
		 {
			 System.out.println(e1.nextElement());
		 }
		 
		 
		 
	}

}
