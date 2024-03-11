package com.lang.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		WebElement dropdown= driver.findElement(By.name("my-select"));
		Select select=new Select(dropdown);
		
		select.selectByVisibleText("One");
		
		List<WebElement> options =select.getOptions();
		int i=0;
		for (WebElement e:options) {
			
			
			System.out.println(e.getText());
			i=i+1;
			
		}
		
		System.out.println("count is" +i);
		
		List<WebElement> selectedoptions= select.getAllSelectedOptions();
		 int count=0;
		for (WebElement f:selectedoptions) {
			
			System.out.println("Selected option is" +f.getText());
			count =count +1;
			
			
		}
		
		System.out.println("selected count is " +count);

	}
	

}
