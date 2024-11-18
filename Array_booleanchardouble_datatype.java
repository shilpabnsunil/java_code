package assignments;

public class Array_booleanchardouble_datatype {
	
	public static void main(String[] args) {
		
		
		double marks[]=new double[3];
		marks[0]=10.11;
		marks[1]=20.22;
		marks[2]=30.33;
		
		char LastName[]=new char[3];
		LastName[0]='M';
		LastName[1]='S';
		LastName[2]='D';
		
		
		
		for(int i=0;i<3;i++)
		{
			System.out.println("marks->" + marks[i]+"LastName->"+ LastName[i] );
		}
		
		boolean pass_result[]=new boolean[2];
		pass_result[0]=true;
		pass_result[1]=false;
		
		for(int i=0;i<2;i++)
		{
			System.out.println(pass_result[i]);
		}
		
	}
	
	

}
