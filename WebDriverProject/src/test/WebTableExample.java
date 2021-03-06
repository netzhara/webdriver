package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.w3schools.com/html/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement link = driver.findElement(By.linkText("HTML Tables"));
		link.click();
		
		List<WebElement> tbColumns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		List<WebElement> tbRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Total Columns " + tbColumns.size());
		System.out.println("Total Rows " + tbRows.size());
		
		List<WebElement> tbData = driver.findElements(By.xpath("//table[@id='customers']//tr[4]/td"));
		
		for(WebElement elm : tbData)
			System.out.println(elm.getText());
		
		List<WebElement> thData = driver.findElements(By.xpath("//table[@id='customers']//td[1]"));
		for(WebElement elm : thData)
			System.out.println(elm.getText());
		
	}

}
