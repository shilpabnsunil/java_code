package collections_program;

import java.util.ArrayList;
import java.util.List;

public class List_pgm4 {
	
	public static void main(String[] args) {

		List li= new  ArrayList();
		 li.add(876);
		 li.add(123);
		 li.add(345);
		 li.add(678);
		 li.add(432);
		 System.out.println(li.size());//size method gives size of list
		 System.out.println(li);
		 
		 //contains methods
		 boolean b1=li.contains("shilpa");
          System.out.println(b1);
}
}
