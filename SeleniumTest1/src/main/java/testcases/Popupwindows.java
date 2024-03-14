package testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupwindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
	    driver.get("https://stqatools.com/demo/Windows.php");
	    String parentwindow= driver.getWindowHandle();
	    System.out.println(parentwindow);
	    WebElement window = driver.findElement(By.xpath("//button[text()=' Click to open new Window ']"));
	    window.click();
	    Thread.sleep(3000);
	    
	    Set<String> tabs  =driver.getWindowHandles();
	    
	    for (String child:tabs) {
	    	System.out.println("windows " +child);
	    	if (!child.equalsIgnoreCase(parentwindow)) {
	    	driver.switchTo().window(child);
	    	System.out.println(driver.getTitle());
	    	}
	    }
	    

	}

}
