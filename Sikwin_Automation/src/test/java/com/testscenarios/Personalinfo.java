package com.testscenarios;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Personalinfo {

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

driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[1]/div/div[2]/div/form/div[1]/div/div[1]/div/input")).sendKeys("AliHamza1");

		// password

driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[1]/div/div[2]/div/form/div[2]/div/div[1]/div/input")).sendKeys("000000");

		// verify

driver.findElement(By.xpath("//*[@id=\"jyCaptcha\"]/div/div/div[1]")).click();

		Thread.sleep(15000);

		// Login

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[1]/div/div[2]/div/button")).click();

		Thread.sleep(5000);

		// Account
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[1]/div[1]/div/div[3]/div[1]/a")).click();

		Thread.sleep(2000);

		JavascriptExecutor Jsexecutor = (JavascriptExecutor) driver;

		Jsexecutor.executeScript("window.scrollBy(0,300)");

		Thread.sleep(2000);

		// Mailbox

driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[2]/form/div[3]/div/div/input")).clear();

		Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[2]/form/div[3]/div/div/input")).sendKeys("sachu611@gmail.com");

		// Address

driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[2]/form/div[4]/div/div/input")).clear();

		Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[2]/form/div[4]/div/div/input")).sendKeys("Corinc Tower, fujairah");

		// Facebook

driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/div/div/input")).clear();

		Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/div/div/input")).sendKeys("facebook.com");

		// click calendar

driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/div/div/input")).click();

		Thread.sleep(2000);
		
		//year button
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[1]/span[1]")).click();
		
		Thread.sleep(2000);
		
		// click 1992		
			
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/table[2]/tbody/tr[1]/td[3]/a")).click();
		
		Thread.sleep(2000);
		
		// Click may
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/table[3]/tbody/tr[2]/td[1]/div/a")).click();
		
		Thread.sleep(2000);
		
		
		//Day 1
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/table[1]/tbody/tr[2]/td[6]/div/span")).click();
		
		
		Thread.sleep(2000);
		
		
		//save button
		
	      driver.findElement(By.xpath("//*[@id='app']/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[2]/form/div[6]/div/button")).click();

	      Thread.sleep(2000);
	      
	      
	      
		
		//String year = "1992";
		
		//String month = "November";
		
		//String date = "5";
		
		// Click Calendar
		
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[2]/form/div[6]/div/button")).click();
		
		//Thread.sleep(2000);
		
		//html/body/div[4]/div[1]/div/div[2]/table[1]/tbody/tr[2]/td[6]/div/span
		
		
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/table[1]/tbody/tr[2]/td[6]/div/span")).click();
		
		//html/body/div[4]/div[1]/div/div[1]/span[2]
	
		
		//while(true)
		//{
			//String monthexp = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[1]/span[2]")).getText();
			
			//String yearexp = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[1]/span[1]")).getText();
			
			//if(monthexp.equalsIgnoreCase(month) && yearexp.equals(year))
				
				//break;
			
			//else
			//{
				//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[1]/button[4]")).click();
				
				//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[1]/button[1]")).click();				
				
		//	}			
					
			
		//}
	
	// calendar code to send date directly
		
//WebElement sendate = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/div/div/input"));

		// send date

		//sendate.sendKeys("1992-11-06");
		
		//Thread.sleep(2000);
				
		
      
		// Click Change Phone Number

      driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[1]/button")).click();
        

		Thread.sleep(2000);

		// Add New Phone Number

		Actions action = new Actions(driver);

WebElement ChPhNumber = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/form/div[1]/div/div[1]/div[2]/input"));

		action.moveToElement(ChPhNumber);

		action.sendKeys(ChPhNumber, "1234567890").build().perform();

		Thread.sleep(2000);

		// Verification code

WebElement VerCode = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/form/div[2]/div/div[1]/div[2]/input"));

		action.moveToElement(VerCode);

		action.sendKeys(VerCode, "1234").build().perform();

		Thread.sleep(2000);

		// Close Button

		WebElement CloseButton = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/button/i"));

		action.moveToElement(CloseButton);

		action.click().build().perform();

		// Click Change Password

driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[2]/button")).click();

		Thread.sleep(2000);

		// Add Original Password

WebElement OrPassword = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/form/div[1]/div/div[1]/div[2]/input"));

		action.moveToElement(OrPassword);

		action.sendKeys(OrPassword, "123456").build().perform();

		Thread.sleep(2000);

		// Add New Password

WebElement NwPassword = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/form/div[2]/div/div[1]/div[2]/input"));

		action.moveToElement(NwPassword);

		action.sendKeys(NwPassword, "12345678").build().perform();

		Thread.sleep(2000);

		// Add Confirm Password

WebElement CfPassword = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/form/div[3]/div/div[1]/div[2]/input"));

		action.moveToElement(CfPassword);

		action.sendKeys(CfPassword, "12345678").build().perform();

		Thread.sleep(2000);

		// Close password Button

		WebElement CloseButton2 = driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/button/i"));

		action.moveToElement(CloseButton2);

		action.click().build().perform();

		// Click Change Withdraw Password

driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div[3]/button")).click();

		Thread.sleep(2000);

		// Add Verification code

WebElement Vcode = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div/form/div[2]/div/div[1]/div[2]/input"));

		action.moveToElement(Vcode);

		action.sendKeys(Vcode, "1234").build().perform();

		Thread.sleep(2000);

		// Add withdrawal Password

WebElement WPassword = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div/form/div[3]/div/div[1]/div[2]/input"));

		action.moveToElement(WPassword);

		action.sendKeys(WPassword, "12345678").build().perform();

		Thread.sleep(2000);

		// Add Confirm Password

WebElement CwPassword = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div/form/div[4]/div/div[1]/div[2]/input"));

		action.moveToElement(CwPassword);

		action.sendKeys(CwPassword, "12345678").build().perform();

		Thread.sleep(2000);

		// Confirm Button

		WebElement ConfirmButton = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/button"));

		action.moveToElement(ConfirmButton);

		action.click().build().perform();

	}

	@BeforeClass
	public void beforeClass() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://skbet101.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

	@AfterClass
	public void afterClass() {

	}

}
