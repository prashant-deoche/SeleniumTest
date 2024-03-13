package com.lang.selenium;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertscheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		Wait <WebDriver> wait= new WebDriverWait(driver,Duration.ofSeconds(2));
		//driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		
		WebElement link = driver.findElement(By.linkText("See an example alert"));
		link.click();
		//Alert alert=wait.until(ExpectedConditions.alertIsPresent());
        Alert alert= driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		

	}

}
