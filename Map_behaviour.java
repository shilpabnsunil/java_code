package collections_program;

import java.util.HashMap;
import java.util.Map;

public class Map_behaviour {
	public static void main(String[] args) {
		
		
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("shilpa", "JPC10");
		m1.put("manish", "JPC11");
		m1.put("suyog", "JPC12");
		m1.put("sunil", "JPC13");
		System.out.println(m1);
		
		//using wrapper class we can remove syntax erroe means yellow line in code
		//string and integer wrapper class used 
		Map<String,Integer> m2=new HashMap<String,Integer>();
		m2.put("rajkumar", 10);
		m2.put("supriya", 23);
		m2.put("himashree", 288);
		m2.put("dhanvi", 988);
		System.out.println(m2);
		
	}

}
