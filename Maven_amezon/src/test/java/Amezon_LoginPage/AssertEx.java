package Amezon_LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEx {
	
	String name= "mouse";
	boolean x=false;
	SoftAssert softassert=new SoftAssert();
	@Test
	public void Test1()
	{
		/*
		 * if(name.equals("mouse")) { System.out.println("condition true"); }
		 */
		
		//Assert.assertEquals(name, "cat");
		
		//Assert.assertTrue(x);//false
		//System.out.println("afterHardAssert");
		
		softassert.assertFalse(x);
		System.out.println("aftersoftAssert");
		//softassert.assertAll();		
		
	}
	
}
