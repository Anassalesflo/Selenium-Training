package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wenbsitetraining {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
    	
    	ChromeOptions options= new ChromeOptions();
    	options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		//options.addArguments("--incognito");
		//options.addArguments("--ignore-certificate-errors");
        //options.addArguments("--disable-popup-blocking");
		
		WebDriver driver = new ChromeDriver(options);
	 
	    
	    driver.get("https://qatestid12.wixsite.com/qaspecialist");
	    
	    WebDriverWait wait2 = new WebDriverWait(driver,100);
	    wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"comp-ifgtula74label\"]")));
	    
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//*[@id=\"comp-jhrgftz1input\"]")).sendKeys("abcd");
	    driver.findElement(By.xpath("//*[@id=\"comp-jhrggrufinput\"]")).sendKeys("nopassword");
	   
	    
	    Thread.sleep(2000);
	    
	    driver.close();
	    Thread.sleep(2000);
	    driver.quit();
	    
	    

	}
	

}
