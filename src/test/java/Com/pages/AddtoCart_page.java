package Com.pages;

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

public class AddtoCart_page {
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
	
	public void Select_product()
	{
		WebElement a= driver.findElement(By.xpath("//*[@id=\"tbodyid\"]//div[1]//div//div"));
		a.click();
		
	}
	public void Add_cart() throws IOException
	{
		WebElement b=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]//div[2]//div//a"));
		b.click();
		screenshot("C:\\Users\\BLTuser.BLT52\\eclipse-workspace\\Project\\src\\test\\resources\\Screenshots\\cart.png");
	}
	public void screenshot(String path) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot)driver;//To take Screenshot
		File Source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File(path));

	}

}
