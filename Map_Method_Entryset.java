package collections_program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Method_Entryset {
public static void main(String[] args) {
		
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("JPC10","shilpa");
		m1.put("JPC11","manish");
		m1.put("JPC12","suyog");
		m1.put("JPC13","sunil");
		System.out.println(m1);
		
		Set<Entry<String,String>> p1=m1.entrySet();
		Iterator<Entry<String,String>>i1=p1.iterator();
		
	while(i1.hasNext())
		{
		System.out.println(i1.next());
		}
	
}
}


