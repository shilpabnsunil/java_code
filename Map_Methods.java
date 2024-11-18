package collections_program;

import java.util.HashMap;
import java.util.Map;

public class Map_Methods {
	
public static void main(String[] args) {
		
		
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("shilpa", "JPC10");
		m1.put("manish", "JPC11");
		m1.put("suyog", "JPC12");
		m1.put("sunil", "JPC13");
		System.out.println(m1);
		
		//using wrapper class we can remove syntax erroe means yellow line in code
		//string and integer wrapper class used 
		Map<String,String> m2=new HashMap<String,String>();
		m2.put("rajkumar", "JPC110");
		m2.put("supriya", "JPC120");
		m2.put("himashree", "JPC130");
		m2.put("dhanvi", "JPC140");
		System.out.println(m2);
		
		boolean b1=m1.equals(m2);//compareing
		System.out.println(b1);
		
		m1.putAll(m2);//add all from m2 to m1 
		System.out.println(m1);
		
		m1.clear();//remove all data from m1 
		System.out.println(m1);
		
		System.out.println(m1.isEmpty());//checking m1 is empty or not 
		
		//if not present add , if it is present it was not added
		m1.putIfAbsent("JTM11", "vidhya");
		System.out.println(m1);
				
		m1.putIfAbsent("JTM13", "jyothi");
		System.out.println(m1);
		
	
	}

}
