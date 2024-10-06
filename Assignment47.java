package assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment47 {
	public static void main(String[] args) {
		
		Set s1=new HashSet();
		 s1.add(10);//set accept heterogenenos value
		 s1.add(30);
		 s1.add(50);
		 s1.add("shilpa");
		 s1.add(null);//accept single null 
		 s1.add(null);
		 s1.add(null);
		 s1.add(null);
		 s1.add(10);//duplicate vales does not accept
		 s1.add(30);//set is dynamic in nature
		 s1.add(50);
		 System.out.println(s1);
		 
		 
		 Iterator I1=s1.iterator();
		 
		 while(I1.hasNext()) {
			 
			 System.out.println(I1.next());
		 }
		 
		
		
	}

}
