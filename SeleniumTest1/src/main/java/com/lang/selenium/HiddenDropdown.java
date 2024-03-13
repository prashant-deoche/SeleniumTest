package com.lang.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://flipkart.com");
		
		WebElement searchBox= driver.findElement(By.xpath("//input[@name='q']"));
		
		searchBox.sendKeys("iphone");
		Thread.sleep(3000);
		
		List<WebElement> searchList = driver.findElements(By.xpath("//a[@class='oleBil']"));
		System.out.println("Total items " + searchList.size());
		
		for (WebElement s:searchList) {
			
			System.out.println(s.getText());
			
			if(s.getText().contains("iphone 13")) {
				s.click();
				break;
			}
		}
		

	}

}
