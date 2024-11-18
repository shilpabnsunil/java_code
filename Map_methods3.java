package collections_program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_methods3 {
	public static void main(String[] args) {
		
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("JPC10","shilpa");
		m1.put("JPC11","manish");
		m1.put("JPC12","suyog");
		m1.put("JPC13","sunil");
		System.out.println(m1);
		
		for(String s1:m1.keySet())//fetch all key values
		{
			System.out.println(s1);
		}
		
		for(String s2:m1.values())//fetch all values 
		{
			System.out.println(s2);
		}
		
		for(Entry<String,String> s3 : m1.entrySet())//fetch both key and values 
		{
			System.out.println(s3);
			
		}
		
		
	}

}
