package collections_program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_program {
	
public static void main(String[] args) {
		
		Vector V1=new Vector();
		V1.add(10);
		V1.add(34);
		V1.add("shilpa");
		V1.add("shilpa");
		V1.add(null);
		V1.add(10);
		V1.add(null);
		V1.add(null);
	
		V1.add(34);
		V1.add("BN");
		System.out.println(V1);
		
		Iterator I1=V1.iterator();
		 
		 while(I1.hasNext()) {
			 
			 System.out.println(I1.next());
		 }
		 
		 ListIterator i2=V1.listIterator();
		 while(i2.hasNext())
		 {
			 //farward iteration
			 System.out.println(i2.next());
		 }
		 
		
		
	}

}
