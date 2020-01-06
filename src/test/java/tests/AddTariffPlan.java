package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddTariffPlan {

	WebDriver driver;
	
	@Test
	public void AddTarff_plan(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// 1. Go to http://demo.guru99.com/telecom/  
		driver.get("http://demo.guru99.com/telecom/");
		
		driver.findElement(By.xpath("//*[@id='one']/div/div[3]/div[1]/h3/a")).click(); 
		
		driver.findElement(By.xpath("//*[@id='rental1']")).sendKeys("500");
		driver.findElement(By.xpath("//*[@id='local_minutes']")).sendKeys("200");
		driver.findElement(By.xpath("//*[@id='inter_minutes']")).sendKeys("100");
		driver.findElement(By.xpath("//*[@id='sms_pack']")).sendKeys("500");
		driver.findElement(By.xpath("//*[@id='minutes_charges']")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id='inter_charges']")).sendKeys("20");
		driver.findElement(By.xpath("//*[@id='sms_charges']")).sendKeys("4"); 
		
		driver.findElement(By.xpath("//*[@id='main']/div/form/div/div[36]/ul/li[1]/input")).click();  
	}
}
