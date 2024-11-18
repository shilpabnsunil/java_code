package collections_program;

import java.util.HashMap;
import java.util.Map;

public class Map_methods2 {
	public static void main(String[] args) {

		Map<String,String> m1=new HashMap<String,String>();
		m1.put("JPC10","shilpa");
		m1.put("JPC11","manish");
		m1.put("JPC12","suyog");
		m1.put("JPC13","sunil");
		System.out.println(m1);
		
		//using wrapper class we can remove syntax erroe means yellow line in code
		//string and integer wrapper class used 
		Map<String,String> m2=new HashMap<String,String>();
		m2.put( "JPC110","rajkumar");
		m2.put("JPC120","supriya");
		m2.put("JPC130","himashree");
		m2.put("JPC140","dhanvi");
		System.out.println(m2);
		
		
		//containsKey checks for key values
		//containsValue check for values 
		boolean b1=m1.containsKey("JPC140");
		boolean b2=m1.containsValue("sunil");
		System.out.println(b1);
		System.out.println(b2);
		
		
		
		
		
		
	}

}
