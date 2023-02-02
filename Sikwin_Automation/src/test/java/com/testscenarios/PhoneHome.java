package com.testscenarios;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class PhoneHome {
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  //Enter username	  
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[1]/div/div/div/input")).sendKeys("jay@qq.com");
	  	  
	  //Enter password
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[2]/div/div/div/input")).sendKeys("ck123456");
	  
	  //click login button
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/form/div[3]/div/button")).click();
	  
	  Thread.sleep(5000);
	  
	  //WebElement lang = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[1]/div/div[2]/div[3]/div/div[1]/div/i"));
			  
	//Select language = new Select(lang);
	  
	 //language.selectByVisibleText("English");
	  
	  //Thread.sleep(5000);
	  
	  //Dropdown button	   
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[1]/div/i")).click();
	  
	//Selecting English	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div/div[2]/div[3]/div/div[2]/ul[2]/li[1]")).click();
	
	//Node List
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/ul/li[1]")).click();
	
	//Add Node 
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/button")).click();
	
	//Add Node
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/form/div[1]/div[1]/div/div/div[1]/div/input")).sendKeys("Abhinav");
	
		
	//Add URL
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/form/div[1]/div[2]/div/div/div[1]/div/input")).sendKeys("139.59.120.177");
	
	//Add key
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/form/div[2]/div[1]/div/div/div[1]/div/input")).sendKeys("fusionpbx");
	
	//Add DB Host
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/form/div[2]/div[2]/div/div/div[1]/div/input")).sendKeys("139.59.120.177");
	
	//Add DB Name
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/form/div[3]/div[1]/div/div/div[1]/div/input")).sendKeys("fusionpbx");
	
	//Add DB Password
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/form/div[3]/div[2]/div/div/div[1]/div/input")).sendKeys("4JhOKNiqCLzvrn0F12G62WHaHg");
	
	//Add DB User
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/form/div[4]/div/div/div/div[1]/div/input")).sendKeys("fusionpbx");
	
	//Add Gateway_uuid
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/form/div[5]/div/div/div/div/div/input")).sendKeys("E193b998-6c43-4b48-b53e-8447ef2e8362");
	
	//Click Save Button
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/div/button[2]/span")).click();
	
	Thread.sleep(2000);
	
	//Click Cancel Button
	driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/a/i")).click();
	
	Thread.sleep(2000);
	
	//Click Extension List
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/ul/li[2]/span")).click();
		
		
	//Add
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/button")).click();
	
	//extension List-Add Name
			
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[1]/div[1]/div/div/div/div/input")).sendKeys("Automate");	
	
	//extension List-Add Password
	
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[1]/div[2]/div/div/div/div/input")).sendKeys("Automate");	
	
	//extension List-Extension
	
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[2]/div[2]/div/div/div/div/input")).sendKeys("9998");	
	
	  Thread.sleep(2000);
	  
		//extension List- Select Node
	
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[2]/div[1]/div/div/div/div[1]/div/i")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[2]/div[1]/div/div/div/div[2]/ul[2]/li")).click();
	
	Thread.sleep(2000);
	
	//extension List-Save Button
	
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[3]/button[2]")).click();
	
	Thread.sleep(2000);
	
	//Click Platform List
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/ul/li[3]/span")).click();
	
	
	//Click Add Platform List
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/button/span")).click();
	
	
	//Add name - Platform List
	
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[1]/div[1]/div/div/div/div/input")).sendKeys("Du Platform2");

	//Add Password - Platform List
	
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[1]/div[2]/div/div/div/div/input")).sendKeys("DuPlatform");
	
	//Add DB User  - Platform List
	
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[2]/div[2]/div/div/div/div/input")).sendKeys("DuPlatform");
	
	//Add DB Name - Platform List
	
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[3]/div[1]/div/div/div/div/input")).sendKeys("DuPlatform");
	
	//Add DB Port - Platform List
	
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[3]/div[2]/div/div/div/div/input")).sendKeys("DuPlatform");
	
	//Add DB Key - Platform List
	
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[4]/div[1]/div/div/div/div/input")).sendKeys("DuPlatform");
	
	//Add DB Host - Platform List
	
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[4]/div[2]/div/div/div/div/input")).sendKeys("DuPlatform");
	
	//Add Node - Platform List
	
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[2]/div[1]/div/div/div/div[1]/div/i")).click();
	
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[2]/div[1]/div/div/div/div[2]/ul[2]/li")).click();
	
	//Click Save Button 
	
	driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div[2]/form/div[5]/button[2]/span")).click();
	
	
	
	
	
	
	
	
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  driver = new ChromeDriver();
	  
	  driver.get("https://testboss.aivoip.dev/login");
	  
	 driver.manage().window().maximize();
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  
  }

}
