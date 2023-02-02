package com.testscenarios;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class MyWallet {

	WebDriver driver;

	@Test
	public void f() throws Exception {

		// close button

		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/button/i")).click();

		Thread.sleep(5000);

		// Login button

		driver.findElement(By.xpath("//*[text()='Login']")).click();

		Thread.sleep(5000);

		// username

		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[1]/div/div[2]/div/form/div[1]/div/div[1]/div/input"))
				.sendKeys("AliHamza1");

		// password

		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[1]/div/div[2]/div/form/div[2]/div/div[1]/div/input"))
				.sendKeys("000000");

		// verify

		driver.findElement(By.xpath("//*[@id=\"jyCaptcha\"]/div/div/div[1]")).click();

		Thread.sleep(15000);

		// Login

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[1]/div/div[2]/div/button")).click();

		Thread.sleep(5000);

		// Account
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[1]/div[1]/div/div[3]/div[1]/a")).click();

		Thread.sleep(2000);

		// My Wallet
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[1]/div[2]/ul/li[2]/a")).click();

		Thread.sleep(2000);

		// Deposit
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[2]/a[1]/button")).click();

		Thread.sleep(2000);

		// UPI
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/ul/li[2]")).click();

		Thread.sleep(2000);
		
		// UPI
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/ul/li[2]")).click();

		Thread.sleep(2000);
		
		// UPI
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/ul/li[2]")).click();

		Thread.sleep(2000);
		
		// UPI depoist
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/span")).click();

		Thread.sleep(2000);
		
		
		
      
		
		// Depoist Amount
	    driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[1]/div[2]/div/input")).sendKeys("10000");

		Thread.sleep(10000);
		
		//Manually upload image of money give some time and click deopist button
		
		Actions action = new Actions(driver);
		
		WebElement Dbutton = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[3]/button"));
		
		action.moveToElement(Dbutton);
		
		action.click().build().perform();
		

		Thread.sleep(2000);
		
		//Confirm button
		
		
		//Alert alert = driver.switchTo().alert();
		
		//alert.accept();
		
		 JavascriptExecutor Jsexecutor = (JavascriptExecutor)driver;
		
	  WebElement Cbutton = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/button[2]/span"));
	  
		Jsexecutor.executeScript("arguments[0].click();", Cbutton);
		

		Thread.sleep(2000);
		
		//action.moveToElement(Cbutton);
		
		//action.click().build().perform();
		
		
		
			
		
			
			
		
		
		// Upload Money
		
      //WebElement uploadfile = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[2]/div[2]/div/div/div/p"));
    		 
    	//uploadfile.sendKeys("D:\\Money\\money.jpg");

	 // Thread.sleep(2000);
		
		
		//WebElement element = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[2]/div[2]/div/div/div/p"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//Setting value for "style" attribute to make textbox visible
		//js.executeScript("arguments[0].style.display='block';", element);
		//driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[2]/div[2]/div/div/div/p")).sendKeys("D:\\Money\\money.jpg");
		
		

	}

	@BeforeClass
	public void beforeClass() throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://skbet101.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		//driver = WebDriverManager.chromedriver().create();
		//driver.get("http://skbet101.com/");
		//driver.manage().window().maximize();
		//Thread.sleep(5000);

	}

	@AfterClass
	public void afterClass() {

	}

}
