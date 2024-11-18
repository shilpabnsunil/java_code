package array_program;

import java.util.Arrays;

public class TwoArrayEquals_EachOthers {
	
	public static void main(String[] args) {
		
		int Student_Id1[]=new int[4];
		Student_Id1[0]=10;
		Student_Id1[1]=11;
		Student_Id1[2]=12;
		Student_Id1[3]=13;
		int Student_Id2[]=new int[4];
		Student_Id2[0]=10;
		Student_Id2[1]=11;
		Student_Id2[2]=12;
		Student_Id2[3]=13;
		
		boolean b1=Arrays.equals(Student_Id1, Student_Id2);
		System.out.println(b1);
		
	}

}
