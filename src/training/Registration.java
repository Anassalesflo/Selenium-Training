package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Registration {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		// options.addArguments("--incognito");
		// options.addArguments("--ignore-certificate-errors");
		// options.addArguments("--disable-popup-blocking");
		WebDriver driver = new ChromeDriver(options);

		// WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		WebElement firstname;
		firstname = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
		firstname.sendKeys("Ali");
		
		Thread.sleep(2000);
		
		WebElement lasttname;
		lasttname = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
		lasttname.sendKeys("Akber");
		
		Thread.sleep(2000);
		
		WebElement email;
		email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		email.sendKeys("nmy@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement telephone;
		telephone = driver.findElement(By.xpath("//*[@id=\"input-telephone\"]"));
		telephone.sendKeys("0346-2800291");
		
		Thread.sleep(2000);
		
		WebElement pass;
		pass = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		pass.sendKeys("ali123");
		
		Thread.sleep(2000);
		
		WebElement confirmpass;
		confirmpass = driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
		confirmpass.sendKeys("ali123");
		
		Thread.sleep(4000);
		
		WebElement checkbox1;
		checkbox1= driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
		checkbox1.click();
		
		Thread.sleep(4000);
		
		WebElement btn1;
		btn1= driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		btn1.click();
		
		Thread.sleep(4000);
		
		driver.get("https://demo.opencart.com/index.php?route=account/logout");
		
		WebElement btn2;
		btn2= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
		btn2.click();


	}
}
