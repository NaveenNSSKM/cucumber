package org.r;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RClass1 {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\RClass\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		Robot r = new Robot();
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Inmakes_Infotech");
		

		
		a.doubleClick(search).perform();
		
		
	}

}
