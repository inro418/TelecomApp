package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PayBilling {

	WebDriver driver;
	
	@Test
	public void Pay_Billing(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// 1. Go to http://demo.guru99.com/telecom/  
		driver.get("http://demo.guru99.com/telecom/");
		
        driver.findElement(By.xpath("//*[@id='one']/div/div[3]/div[2]/h3/a")).click(); 
		
		driver.findElement(By.xpath("//*[@id='customer_id']")).sendKeys("591600");
		
		
		driver.findElement(By.xpath("//*[@id='main']/div/form/div/div[6]/input")).click(); 
		
	}
}
