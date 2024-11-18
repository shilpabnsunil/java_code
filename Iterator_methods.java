package collections_program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_methods {
	
	public static void main(String[] args) {

		List li= new  ArrayList();
		 li.add(876);
		 li.add(123);
		 li.add(345);
		 li.add(678);
		 li.add(432);
		 //System.out.println(li.size());
		 
		 Iterator lit=li.iterator();
		 //return type of HasNest is boolean
		 while(lit.hasNext()) {
			 
			 //return type of next is object
			 System.out.println(lit.next());
		 }
		 
		 
	}

}
