package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
		createNewAccount.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		
		firstName.sendKeys("Devona");
		lastName.sendKeys("Mwakalebule");
		mobile.sendKeys("979-739-0607");
		password.sendKeys("ABCd1234");
		
		String sex = "Male";
		
		String gender = "//label[text()='" + sex + "']/following-sibling::input";
		
		WebElement genSex = driver.findElement(By.xpath(gender));
		genSex.click();
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']/option[12]"));
		WebElement date = driver.findElement(By.xpath("//select[@title='Day']/option[12]"));
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']/option[12]"));
		month.click();
		date.click();
		year.click();

	}

}
