package testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframetest {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/iframe");
	    String window1= driver.getWindowHandle();
	    WebElement frame=driver.findElement(By.id("mce_0_ifr"));
	    driver.switchTo().frame(frame);
	    WebElement text = driver.findElement(By.xpath("//body[@id='tinymce']"));
	    text.clear();
	    text.sendKeys("Hello Welcome");
	    driver.switchTo().defaultContent();
	    WebElement link = driver.findElement(By.linkText("Elemental Selenium"));
	    link.click();
	   Set <String> windows= driver.getWindowHandles();
	     String window2=null;
	   for(String w:windows) {
		   if (!w.equalsIgnoreCase(window1)) {
			   
		       window2=w;
		       break;
			   
		   }
		 
		   
	   }
	   
	   driver.switchTo().window(window2);
	   System.out.println(driver.getTitle());

	}

}
