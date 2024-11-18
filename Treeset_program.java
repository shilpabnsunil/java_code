package collections_program;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

public class Treeset_program {
	
	
public static void main(String[] args) {
		
	    TreeSet TS1=new TreeSet();
	    TS1.add(233);
		TS1.add(10);
		TS1.add(15);
		
		TS1.add(233);
		TS1.add(10);
	    TS1.add(15);

		System.out.println(TS1);
		
		Iterator I1=TS1.iterator();
		 
		 while(I1.hasNext()) {
			 
			 System.out.println(I1.next());
		 }
		 
	

	
	}

}
