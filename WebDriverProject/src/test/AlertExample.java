package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement element =driver.findElement(By.xpath("//button[@id='alertButton']"));
		element.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		WebElement elm1 = driver.findElement(By.xpath("//*[@id='confirmButton']"));
		elm1.click();
		
		Alert alert1 =driver.switchTo().alert();
		alert1.dismiss();
		
		
		WebElement elem = driver.findElement(By.xpath("//*[@id='promtButton']"));
		elem.click();
		
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.sendKeys("Some Text");
		alert2.accept();
		
		
	}

}
