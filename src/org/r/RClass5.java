package org.r;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RClass5 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\RClass\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		Robot r = new Robot();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement monitor = driver.findElement(By.xpath("(//div[@class='CXW8mj'])[11]"));
		a.contextClick(monitor).perform();
		Thread.sleep(2000);		
		
		
		for (int i = 0; i <= 4; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
