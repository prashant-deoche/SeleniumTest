package com.lang.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		WebElement checkbox=driver.findElement(By.cssSelector("input#isAgeSelected"));
		checkbox.click();
		Thread.sleep(2000);
		
		System.out.println("Checkbox selected "+checkbox.isSelected());
		checkbox.click();
		Thread.sleep(2000);
		System.out.println("Checkbox unselected "+checkbox.isSelected());
		
		
		

	}

}
