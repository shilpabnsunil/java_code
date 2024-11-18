package dataProvider;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Registration_dataprovider {
	@DataProvider(name="logins")
	public Object[][] crediantials()
	{
		Object data1[][]=new Object[10][5];
		//1st row data
		data1[0][0]= "shilpa";
		data1[0][1]="BN";
		data1[0][2]= "10-04-1991";
		data1[0][3]="Female";
		data1[0][4]= "shilpa@gmail.com";
		
		//2nd row data
		data1[1][0]= "manish";
		data1[1][1]="tiwari";
		data1[1][2]= "10-04-1992";
		data1[1][3]="mail";
		data1[1][4]= "manish@gmail.com";
		//3rd row value
		data1[2][0]= "dhanvi";
		data1[2][1]="S";
		data1[2][2]= "15-01-1991";
		data1[2][3]="Female";
		data1[2][4]= "dhanvi@gmail.com";
		//4rd row value
		data1[3][0]= "sunil";
		data1[3][1]="kumar";
		data1[3][2]= "15-04-1996";
		data1[3][3]="male";
		data1[3][4]= "sunil@gmail.com";
		//5rd row value
		data1[4][0]= "hima";
		data1[4][1]="BN";
		data1[4][2]= "19-04-1994";
		data1[4][3]="Female";
		data1[4][4]= "hima@gmail.com";
		//6rd row value
				data1[5][0]= "shantha";
				data1[5][1]="M";
				data1[5][2]= "19-04-1972";
				data1[5][3]="Female";
				data1[5][4]= "shantha@gmail.com";
				//7rd row value
				data1[6][0]= "narayan";
				data1[6][1]="KC";
				data1[6][2]= "19-04-1984";
				data1[6][3]="Male";
				data1[6][4]= "narayan@gmail.com";
				//8rd row value
				data1[7][0]= "lishroe";
				data1[7][1]="kumar";
				data1[7][2]= "24-04-1994";
				data1[7][3]="male";
				data1[7][4]= "lishroe@gmail.com";
				//9rd row value
				data1[8][0]= "likthas";
				data1[8][1]="TR";
				data1[8][2]= "19-07-1994";
				data1[8][3]="male";
				data1[8][4]= "likthas@gmail.com";
				//10rd row value
				data1[9][0]= "lakshmi";
				data1[9][1]="rani";
				data1[9][2]= "19-04-2000";
				data1[9][3]="Female";
				data1[9][4]= "lakshmi@gmail.com";
				
		return data1;
		
	}
	
	@Test(dataProvider="logins")
	public void Registrationdata(String FN,String LN,String DOB,String Gender,String email)
	{
		System.out.println(FN);
		System.out.println(LN);
		System.out.println(DOB);
		System.out.println(Gender);
		System.out.println(email);

}
}