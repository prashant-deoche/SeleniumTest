package com.lang.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/mouseOver.html");
		
		Actions act=new Actions(driver);
		
		
		WebElement redbox= driver.findElement(By.id("redbox"));
		String color= redbox.getCssValue("background-color");
		System.out.println(color);
		
		
		act.moveToElement(redbox).build().perform();
		Thread.sleep(3000);
		String color1= redbox.getCssValue("background-color");
		System.out.println(color1);
		

	}

}
