package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		//X-Path by using tagname -> "//tagName[@attribute='attribute-value']
		WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		
		
		userName.sendKeys("abc@xyz.com");
		password.sendKeys("abcd123");
		login.click();

		//X-Path by using text() method -> "//*[text()='any words from site page']"
		WebElement create = driver.findElement(By.xpath("//*[text()='Create New Account']"));
		create.click();
	} 

}
