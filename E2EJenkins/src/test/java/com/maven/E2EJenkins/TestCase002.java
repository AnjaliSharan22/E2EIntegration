package com.maven.E2EJenkins;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase002 {
@Test
	
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/ChromeDriver");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
