package Amezon_LoginPage;


import org.testng.annotations.DataProvider;

public class Data_provider
{
	
	 @DataProvider(name="mydata")
		public Object[][] getData()
		{
			
			  Object [][] data=new Object[3][2];//[3][2] means three rows and two col
			  data[0][0]="mahesh@123new";
			  data[0][1]="pass123new";
			  data[1][0]="mahesh@12new";
			  data[1][1]="pass12new";
			  data[2][0]="mahesh@1new";
			  data[2][1]="pass1new";
			 
			/*
			 * String [][] mydata=
			 * {{"abc@mail.com","123","mahesh","snehal"},{"xyz@gmail.com","344","mahesh",
			 * "snehal"},{"pqr@gamil.com","3445","mahesh","snehal"}}; 
			 */
			  return data;
}
}
