package firstJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBr {
	
WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser) throws Exception {
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/04413R744/software/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:/Users/04413R744/software/edgedriver/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else {
			throw new Exception("Browser is not correct");
		}
	}
	
	@Test
	public void petStoreTC1() throws InterruptedException {
		driver.get("https://petstore.octoperf.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Enter the Store")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("[id^=strip]")).sendKeys("j2ee");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("j2ee");
		Thread.sleep(3000);
		driver.findElement(By.name("signon")).click();
		Thread.sleep(3000);
		driver.quit();
	}



}
