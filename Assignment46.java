package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment46 {
	public static void main(String[] args) {
		
			
List li= new  ArrayList();
		
		//data stored in object 
		//data stored in heterogeninues

		 li.add(876);
		 li.add("shilpa");
		 li.add(true);
		 li.add(90.56);
		 li.add(null);
		 System.out.println(li);
		 
     Iterator I1=li.iterator();
		 
		 while(I1.hasNext()) {
			 
			 System.out.println(I1.next());
		 }
	}

}
