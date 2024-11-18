package collections_program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayLIist_program {
	
	public static void main(String[] args) {
		
		ArrayList Al1=new ArrayList();
		Al1.add(10);
		Al1.add(34);
		Al1.add("shilpa");
		Al1.add("shilpa");
		Al1.add(null);
		Al1.add(10);
		Al1.add(null);
		Al1.add(null);
	
		Al1.add(34);
		Al1.add("BN");
		System.out.println(Al1);
		
		Iterator I1=Al1.iterator();
		 
		 while(I1.hasNext()) {
			 
			 System.out.println(I1.next());
		 }
		 
		 ListIterator i2=Al1.listIterator();
		 while(i2.hasNext())
		 {
			 //farward iteration
			 System.out.println(i2.next());
		 }
		 
		
		
	}

}
