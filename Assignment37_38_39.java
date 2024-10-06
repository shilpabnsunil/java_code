package assignments;

import java.util.Date;

public class Assignment37_38_39 {
	
	public static void main(String[] args) {
		
		
		Date d1=new Date();
		System.out.println(d1);//Print present time 
		
		Date d2=new Date(d1.getTime() +(1000*60*60*24*2));//futur time
		System.out.println(d2);
		
		Date d3=new Date(d1.getTime() -(1000*60*60*24*2));//Past time
		System.out.println(d3);
	}
		
	
	

}
