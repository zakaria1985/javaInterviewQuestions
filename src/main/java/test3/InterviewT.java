package test3;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InterviewT {
	public WebDriver driver= null;
	@BeforeClass
	public void open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Dev\\chromeDrive\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();

		
	}
	@Test
	public void start() throws InterruptedException, IOException {
		
		driver.get("https://jqueryui.com/autocomplete/");
		takePicture();
		

}

public void takePicture() throws IOException{
	SimpleDateFormat formate= new SimpleDateFormat("ddMMyyyy");
	Date date = new Date();
	String formateName= formate.format(date);
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("picture1"+formateName+".png"));
	
}
}