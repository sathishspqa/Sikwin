package com.testscenarios;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SignUpPage {

	WebDriver driver;

	@Test
	public void f() throws Exception {
		
		
		//close button

			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/button/i")).click();

				Thread.sleep(5000);

				// sign up button
			
				driver.findElement(By.xpath("//*[text()='Sign-up']")).click();

				Thread.sleep(5000);
				
				// Phone Number

			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div/div/div[1]/div/input")).sendKeys("1234567890");
				
				// Verification Code

				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/div[2]/form/div[2]/div[1]/div/div/div[1]/div/input")).sendKeys("1234");
				
				// Username
				
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/div[2]/form/div[2]/div[3]/div/div/div[1]/div/input")).sendKeys("sat01234");
				
				// Password
				
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/div[2]/form/div[2]/div[4]/div/div/div[1]/div/input")).sendKeys("B123456789");
				
				// Confirm password
				
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/div[2]/form/div[2]/div[5]/div/div/div/div/input")).sendKeys("B123456789");
				
				//Real name
				
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[2]/div/div[2]/div/div/div[2]/form/div[2]/div[6]/div/div/div[1]/div/input")).sendKeys("sat611982");
				
				//Click sign up //*[@id="app"]/div[1]/div[3]/div[2]/div/div[2]/div/div/div[2]/form/button
				
				driver.findElement(By.xpath("//*[@id='app']/div[1]/div[3]/div[2]/div/div[2]/div/div/div[2]/form/button")).click();


		
		
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
