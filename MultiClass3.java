package programs;

public class MultiClass3 extends MultiClass2 {
	
public static void main(String[] args) {
		
		//inherited and calling multiClass1 methods
		add();
		MultiClass3 H=new MultiClass3();
		H.sub();
		
		//inherited and calling multiClass2 methods
		multiplication();
		H.divide();
		
	}

}
