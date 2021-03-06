package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.w3schools.com/html/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement link = driver.findElement(By.linkText("HTML Tables"));
		link.click();
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"main\"]/h2[3]"));
		JavascriptExecutor obj = (JavascriptExecutor) driver;
		obj.executeScript("arguments[0].scrollIntoView();",element);
//		obj.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//		obj.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
		
	}

}
