package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGassert {
	@Test
	public void softasset() {
	SoftAssert softassertion = new SoftAssert();
	System.out.println("soft Execution started");
	softassertion.assertEquals("test", "test1");
	System.out.println("soft Execution ended");	
	softassertion.assertAll();

}
	@Test
	public void hardassert() {
	
		System.out.println("hard Execution started");
	    Assert.assertEquals("test", "test1");
		System.out.println("hard Execution ended");	
		

	}
}
