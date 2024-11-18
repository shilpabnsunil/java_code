package collections_program;

import java.util.ArrayList;
import java.util.List;

public class List_prm3 {
	public static void main(String[] args) {

		List li= new  ArrayList();
		 li.add(876);
		 li.add(123);
		 li.add(345);
		 li.add(678);
		 li.add(432);
		 System.out.println("Before remove object-->" +li);
		 li.remove(1);//remove methods removed particular index object
		
		 System.out.println("After remove object-->"+li);
		 
		 List li2= new  ArrayList();
		 li2.add("shilpa");
		 li2.add("Manish");
		 li2.add("rama");
		 li2.addAll(li);
		 System.out.println(li2);
		 
		 //removeall methods used to remove all collection data of list
		 li2.removeAll(li);
		 System.out.println(li2);
		 
		 
		 

}}
	
