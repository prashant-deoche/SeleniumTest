package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void captureScreenShot(WebDriver driver, String screenshotname) {
		// TODO Auto-generated method stub
		
		 driver=new ChromeDriver();
	    driver.get("https://stqatools.com/demo/Windows.php");
        String timestamp= new SimpleDateFormat ("yyyyMMdd_HHmmss").format(new Date());
        System.out.println(timestamp);
        
        TakesScreenshot ts= (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        
        String destination = "./Screenshots"+"testing"+"_"+timestamp+".png";
        
      try {
    	  FileUtils.copyFile(source, new File(destination));
    	  System.out.println("Screenshot at "+destination);}
    	  catch(IOException e) {
    		  System.out.println("Excetion is "+e.getMessage());
    		  
    	  }
      }

}

