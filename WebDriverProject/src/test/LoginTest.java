package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		Thread.sleep(5000);
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		
		WebElement name = driver.findElement(By.name("user_login"));
		WebElement id = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.name("btn_login"));
		WebElement rememberMe = driver.findElement(By.className("rememberMe"));
		
		name.sendKeys("xyz@abc.com");
		id.sendKeys("Abc@12345");
		rememberMe.click();
		loginBtn.click();
		
		WebElement errorMsg = driver.findElement(By.className("content-sub-heading")); 
		String actualMsg = errorMsg.getText();
		String expMsg = "Log in to continue learning";
		
		if(actualMsg.equals(expMsg)) 
			System.out.println("TC Passed");
		else 
			System.out.println("TC Failed");
		
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links are " + links.size());
		
	    for(WebElement elm : links)
	    	System.out.println(elm.getAttribute("href"));
		

		driver.close();
		
	
	}

}
