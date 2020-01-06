package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddCustomer {

	WebDriver driver;

	@Test
	public void Add_Customer(){  

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// 1. Go to http://demo.guru99.com/telecom/  
		driver.get("http://demo.guru99.com/telecom/");
		
		//2. Add Customer
		driver.findElement(By.xpath("//*[@id='one']/div/div[1]/div[1]/h3/a")).click();  
		driver.findElement(By.xpath("//*[@id='main']/div/form/div/div[1]/label")).click();   
		driver.findElement(By.xpath("//*[@id='fname']")).sendKeys("Oke");
		driver.findElement(By.xpath("//*[@id='lname']")).sendKeys("Owo");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("inro4ebony@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("12 Springett House St Matthew Road Brixton");
		driver.findElement(By.xpath("//*[@id='telephoneno']")).sendKeys("07451789578");
		
		//Submit button has defeat, it can't click by automation
		driver.findElement(By.xpath("//input[@name='submit']")).submit();
	}
}
