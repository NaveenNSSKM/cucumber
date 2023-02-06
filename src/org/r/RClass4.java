package org.r;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RClass4 {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\RClass\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		Robot r = new Robot();
		
		WebElement select = driver.findElement(By.xpath("//div[text()='Bhawna Collection Loard Shiv Trishul Damru Locket With Puchmukhi Rudraksha Mala Gold-plated Brass, Wood For Men & Women']"));
        a.moveToElement(select).perform();
		a.contextClick(select).perform();
		
		
		for (int i = 0; i < 2; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		}
		
		
	}

}
