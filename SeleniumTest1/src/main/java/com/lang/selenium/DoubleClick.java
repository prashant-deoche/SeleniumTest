package com.lang.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		Actions act =new Actions(driver);
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		driver.manage().window().maximize();
		WebElement clickbutton= driver.findElement(By.xpath("//button[text()='Click Me / Double Click Me!']"));
		act.doubleClick(clickbutton).build().perform();
		
		

	}

}
