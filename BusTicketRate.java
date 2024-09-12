package basics;

public class BusTicketRate {
	
	public static void main(String[] args) {
		int m=1;
		int f=0;
		int age=60;
		int a=1;
		int b=5;
		int c=18;
		int d=60;
		int g=1;
		
		if(g==m) {
			
			System.out.println("take tickets for male");
	     	if(a<age) {
	     		System.out.println("no tickets for childeren below 2yrs");
			
			}
	     	
	     	if(b<age) {
	     		
	     		System.out.println("half tickets for childeren above 2yrs  below 12");
	     		
	     	}
	     	if(c<age) {
	     		System.out.println("full tickets for above 18");
	     		
	     	}
	     	
	     	if(d>=age) {
	     		System.out.println("half tickets for aabove or equal to 60");
	     	}
		}
		else {
			System.out.println("tickets free for female");
		}
		
	}

}
