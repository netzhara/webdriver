package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement from = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement to = driver.findElement(By.xpath(" //*[@id='bank']/li"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		
		
		WebElement fro = driver.findElement(By.xpath("//*[@id='credit4']/a"));
		WebElement t2 = driver.findElement(By.xpath(" //*[@id='loan']/li "));
		Actions action = new Actions(driver);
		action.dragAndDrop(fro, t2).build().perform();
	}

}
