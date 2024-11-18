package collections_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_prm2 {
	
	public static void main(String[] args) {

		List li= new  ArrayList();
		 li.add(876);
		 li.add(123);
		 li.add(345);
		 li.add(678);
		 li.add(432);
		 System.out.println("before sort-->"+li);
		 Collections.sort(li);//collections isa class which as sort method we can use
		 System.out.println("After sort-->"+li);
		 
		 List li2=new ArrayList();
		 li2.add(12);
		 li2.add(23);
		 li2.add("shilpa");
		 li2.add(43);
		 li2.addAll(li);
		 System.out.println(li2);
		 
		 //using get we can get object at particular index number
		 System.out.println(li2.get(3));
		 System.out.println(li2.set(0, "set_value"));
		 System.out.println(li2);//set used to replace value with particular index 
		 
		 boolean b1=li.equals(li2);
		 System.out.println(b1);
		 

}
}
