package application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://www.redbus.in/");
       
       WebElement from = driver.findElement(By.cssSelector("input#src"));
       WebElement dest = driver.findElement(By.cssSelector("input#dest"));
       WebElement cal = driver.findElement(By.cssSelector("div#onwardCal"));
       
       from.sendKeys("Bangalore");
       dest.sendKeys("Chennai");
       cal.click();
       WebElement date = driver.findElement(By.xpath("//span[contains(@class,'DayTiles__CalendarDaysSpan-sc-1xum02u') and (text()='21')]"));
       date.click();
       
       WebElement search = driver.findElement(By.cssSelector("button#search_button"));
       Thread.sleep(2000);
       search.click();
       
       
       
       
	}

}
