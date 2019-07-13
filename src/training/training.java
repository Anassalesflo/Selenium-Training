package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class training {

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

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// driver.manage().window().maximize();

		WebElement username;
		username = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		username.sendKeys("anas.khan94@hotmail.com");

		WebElement password;
		password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("anas123");

		WebElement loginButton;
		loginButton = driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn-primary']"));

		loginButton.click();

		/*
		 * String actualpagetitle = ""; 
		 * String expectedTitle = "My Account";
		 * actualpagetitle = driver.getTitle();
		 * 
		 * System.out.println(actualpagetitle);
		 * 
		 * if (actualpagetitle.contentEquals(expectedTitle)) {
		 * System.out.println("Test Passed!"); } else {
		 * System.out.println("Test Failed"); }
		 * 
		 * String url = ""; url = driver.getCurrentUrl(); System.out.println(url);
		 * 
		 * if (actualpagetitle.contains("Account")) {
		 * System.out.println("URL Test Passed!"); } else {
		 * System.out.println("URL Test Failed"); }
		 */
		WebElement search;
		search = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
		search.sendKeys("HP LP3065");

		WebElement searchButton;
		searchButton = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));

		searchButton.click();

		WebElement Addtocart1;
		Addtocart1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]"));

		Addtocart1.click();

		Thread.sleep(4000);
		WebElement Addtocart2;
		Addtocart2 = driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));

		Addtocart2.click();

		Thread.sleep(4000);

		WebElement items;
		items = driver.findElement(By.xpath("//*[@id=\"cart\"]/button"));

		items.click();

		Thread.sleep(4000);

		WebElement checkout;
		checkout = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong"));

		checkout.click();

		Thread.sleep(4000);

		WebElement continue1;
		continue1 = driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]"));

		continue1.click();

		Thread.sleep(4000);

		WebElement continue2;
		continue2 = driver.findElement(By.xpath("//*[@id=\"button-shipping-address\"]"));

		continue2.click();

		Thread.sleep(4000);

		WebElement continue3;
		continue3 = driver.findElement(By.xpath("//*[@id=\"button-shipping-method\"]"));

		continue3.click();

		Thread.sleep(4000);

		WebElement checkbox;
		checkbox = driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]"));

		checkbox.click();

		WebElement continue4;
		continue4 = driver.findElement(By.xpath("//*[@id=\"button-payment-method\"]"));

		continue4.click();
		
		Thread.sleep(4000);

		WebElement continue5;
		continue5 = driver.findElement(By.xpath("//*[@id=\"button-confirm\"]"));

		continue5.click();
		
		
		Thread.sleep(4000);
		
		String actualpagetitle = "";
		String expectedTitle = "Your order has been placed!";
		actualpagetitle = driver.getTitle();

		System.out.println(actualpagetitle);

		if (actualpagetitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
		  
		

		// driver.close();
		// driver.quit();

	}

}
