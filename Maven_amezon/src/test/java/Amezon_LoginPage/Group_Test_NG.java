package Amezon_LoginPage;


import org.testng.annotations.Test;

public class Group_Test_NG 
{
	
	 @Test(groups= {"sanityTesting"})
	 public void Test1()
	 {
	 	System.out.println("Test1");
	 }
	 
	 @Test(groups= {"RegressionTesting","sanityTesting"})
	 public void Test2()
	 {
	 	System.out.println("Test2");
	 }
	 
	 
	 @Test(groups= {"RegressionTesting","sanityTesting"})
	 public void Test3()
	 {
	 	System.out.println("Test3");
	 }
	 
	 
	 
	 @Test(groups= {"sanityTesting"})
	 public void Test4()
	 {
	 	System.out.println("test4");
	 }
	 
	 
    

	

}
