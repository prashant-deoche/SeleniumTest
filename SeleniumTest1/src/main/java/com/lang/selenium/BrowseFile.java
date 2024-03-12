package com.lang.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		WebElement file= driver.findElement(By.xpath("//input[@name='my-file']"));
		
		file.sendKeys("C:\\Users\\Administrator\\Pictures");
		
		System.out.println(file.getAttribute("value"));
		
		
		
		
		

	}

}
