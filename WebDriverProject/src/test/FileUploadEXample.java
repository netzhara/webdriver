package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadEXample {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		WebElement fileUpload = driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
		fileUpload.sendKeys("/home/tipyanarocketma/Documents/File1");
		
		WebElement checkBox = driver.findElement(By.xpath("//*[@id='terms']"));
		checkBox.click();
		WebElement submitFile = driver.findElement(By.xpath("//*[@id='submitbutton']"));
		submitFile.click();
		
		TakesScreenshot fileUploaded = (TakesScreenshot) driver;
		File minProject = fileUploaded.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(minProject, new File("Txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
