package Com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NextPage_page {
	WebDriver driver;
	WebElement textbox;

	public void url() 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome jars\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://google.com");
	System.out.println(driver.getTitle());

	}
	public void demoblaze_homePage()
	{
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());
	}
	public void Scrollby() throws InterruptedException
	{
		WebElement a=driver.findElement(By.id("next2"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,8000)");
		driver.findElement(By.xpath("//html//body//div[5]//div//div[2]//form//ul//li[2]//button")).click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]//div[4]//div//div//h4//a")).click();
	}
	public void click() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a")).click();
		Thread.sleep(5000);
		screenshot2("C:\\Users\\BLTuser.BLT52\\eclipse-workspace\\Project\\src\\test\\resources\\Screenshots\\nextpage.png");
	}
	public void screenshot2(String path) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot)driver;//To take Screenshot
		File Source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File(path));

	}
}

