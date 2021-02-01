package test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AbcTest {
	
	public WebDriver driver= null;
	@BeforeClass
	public void open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Dev\\chromeDrive\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@Test
	public void start() throws InterruptedException {
		//driver.get("https://www.google.com/");
		driver.get("https://www.amazon.com/");
		WebElement element =driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		WebElement signIn =driver.findElement(By.xpath("//span[text()='Sign in']"));
		Actions action= new Actions(driver);
		action.moveToElement(element).click().moveToElement(signIn).click().build();
				
		Thread.sleep(5000);
		
		//driver.findElement(By.linkText("Privacy Notice")).click();

		 driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("zakariamotin@yahoo.com");
		 
		driver.findElement(By.name("password")).sendKeys("ABHG745");
	String text = driver.findElement(By.xpath("//h4[contains(. ,'There was a problem')]")).getText();
		
		System.out.println(text);
		
	}

}
