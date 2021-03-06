package test;

import java.util.Iterator;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		//Before Clicking new Button
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
	
		WebElement elm = driver.findElement(By.xpath("//button[@id='tabButton']"));
		elm.click();
		
		//After clicking new Window
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> iterator = windowHandles.iterator();
		while(iterator.hasNext()) {
			String current = iterator.next();
			System.out.println(current);
			if(current!=parentWindow)
				driver.switchTo().window(current);
		}
		
		WebElement handle = driver.findElement(By.xpath("//*[@id='sampleHeading']"));
		System.out.println(handle.getText());
		
		
		driver.switchTo().window(parentWindow);
		
		
		
		
	}

}
