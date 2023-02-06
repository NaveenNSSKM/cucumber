package org.r;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RClass3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\RClass\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Actions a = new Actions(driver);
		
		WebElement list = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		list.click();
		
		Thread.sleep(2000);
		WebElement sign = driver.findElement(By.xpath("//span[text()='Sign in']"));
		sign.click();
		
		Thread.sleep(2000);
	    WebElement email = driver.findElement(By.xpath("//span[@tabindex='1']"));
		email.sendKeys("naveenkumar98@gmail.com");
		
	}

}
