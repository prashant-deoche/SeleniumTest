package com.lang.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		
		Actions act= new Actions(driver);
		driver.manage().window().maximize();
		
		
		WebElement frame= driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame);
		WebElement age= driver.findElement(By.xpath("//input[@id='age']"));
		age.sendKeys("20");
		act.moveToElement(age).perform();
		
		
		WebElement tooltip=driver.findElement(By.xpath("//div[@class='ui-tooltip-content']"));
		
		String text= tooltip.getText();
		System.out.println(text);
		driver.close();
		

	}

}
