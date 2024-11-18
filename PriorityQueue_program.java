package collections_program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class PriorityQueue_program {
	public static void main(String[] args) {
		
		PriorityQueue PQ1=new PriorityQueue();
		PQ1.add(10);
		PQ1.add(34);
		PQ1.add(10);
		PQ1.add(34);
		PQ1.add(10);
		PQ1.add(34);	
		PQ1.add(34);
		
		
		System.out.println(PQ1);
		
		Iterator I1=PQ1.iterator();
		 
		 while(I1.hasNext()) {
			 
			 System.out.println(I1.next());
		 }
		 

		
	}


}
