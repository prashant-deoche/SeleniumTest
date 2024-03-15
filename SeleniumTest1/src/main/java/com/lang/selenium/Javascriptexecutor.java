package com.lang.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		WebElement macbook = driver.findElement(By.xpath("//img[@title='MacBook']"));
				
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].scrollIntoView();", macbook);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", macbook);
		
		
		

	}

}
