package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Checkboxtest2 {
	
	WebDriver driver;
	WebElement checkbox;
	
	@BeforeClass
	public void setup() {
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testcase1() {
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		String title=driver.getTitle();
		String expectedTitle = "Selenium Easy - Checkbox demo for automation using selenium";
		Assert.assertEquals(title, expectedTitle);
	}
	
	@Test
	public void testcase2() throws InterruptedException {
		checkbox=driver.findElement(By.cssSelector("input#isAgeSelected"));
		checkbox.click();
		Thread.sleep(2000);
		Assert.assertTrue(checkbox.isSelected());
	}
	
	@Test
	public void testcase3() throws InterruptedException{
		checkbox.click();
		Thread.sleep(2000);
		Assert.assertTrue(checkbox.isSelected());
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}

}
