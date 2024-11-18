package collections_program;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list_Interface {

	public static void main(String[] args) {
		
		//converting child class object to super class type
        //ArrayList is child class 
		//super class is List li
		//upcasting is done below
		//using ref verisable li all methods of list interface will displayed
		//upcasting done from arraylist to list
		
		List li= new  ArrayList();
		
		//data stored in object 
		//data stored in heterogeninues

		 li.add(876);
		 li.add("shilpa");
		 li.add(true);
		 li.add(90.56);
		 li.add(null);
		 System.out.println(li);
		 

		 
	
		 
	}

}