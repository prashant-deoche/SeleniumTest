package com.lang.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		WebElement input= driver.findElement(By.xpath("//input[@name='my-datalist']"));
		
		WebElement datalist= driver.findElement(By.xpath("//datalist[@id='my-options']"));
		
		WebElement dropdownvalue= driver.findElement(By.xpath("//option[@value='New York']"));
		
		input.click();
		
		List<WebElement> list =driver.findElements(By.xpath("//datalist[@id='my-options']/option"));
		
		list.get(2);
		
		

	}

}
