package string_program;

	import java.util.Date;

	public class String_presentPastFuture_time
	{
	public static void main(String[] args) 
	{
		
		Date d1=new Date();
		System.out.println(d1.getTime());
		//epoch converter
		//after creating object calling parameterized the constructor
		//proper date time current it is display
		//+(1000*60*60*24*2) this give future date/time/month
		//-(1000*60*60*24*2) this give past date/time/month
		Date d2=new Date(d1.getTime() +(1000*60*60*24*2));
		System.out.println(d2);
		
		//convert anything to the string we use -ToString
	
		  String current_time= d2.toString(); 
		  String year=current_time.substring(current_time.length()-4); 
		 System.out.println(year);
		 
		 String month= current_time.substring(4,7); 
		 System.out.println(month);
		 
		 String date= current_time.substring(8,10); 
		 System.out.println(date);
		 
		 String dateformat1= date.concat(month).concat(year);
		 System.out.println(dateformat1);
		
		  String dateformat2= date.concat("/").concat(month).concat("/").concat(year);
		  System.out.println(dateformat2); 
		  String dateformat3=date.concat("-").concat(month).concat("-").concat(year);
		  System.out.println(dateformat3);
		 		
	}
	}

