package com.testscenarios;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LoginPage {

	WebDriver driver;

	@Test
	public void f() throws Exception {
		
		
		//close button

		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/button/i")).click();

		Thread.sleep(5000);
		
		
		//Login button

		driver.findElement(By.xpath("//*[text()='Login']")).click();

				Thread.sleep(5000);

			
				//username

				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[1]/div/div[2]/div/form/div[1]/div/div[1]/div/input")).sendKeys("AliHamza1");
				
				// password

				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[1]/div/div[2]/div/form/div[2]/div/div[1]/div/input")).sendKeys("000000");
				
				//verify
				
				driver.findElement(By.xpath("//*[@id=\"jyCaptcha\"]/div/div/div[1]")).click();
				
				Thread.sleep(15000);
				
				// Login

				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[1]/div/div[2]/div/button")).click();

				Thread.sleep(5000);
				


		
		
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
