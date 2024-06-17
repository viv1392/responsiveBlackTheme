package iOSBlack;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class BlackTheme {
	@Test
	public void menTest() throws MalformedURLException {
		XCUITestOptions options=new XCUITestOptions();
		options.setDeviceName("iPhone 15 Pro");
		options.setPlatformName("iOS");
		options.setPlatformVersion("17.5").withBrowserName("safari");
		options.setWdaLaunchTimeout(Duration.ofSeconds(20));
		options.safariAllowPopups();
		URL url =new URL("http://127.0.0.1:4723/");
		IOSDriver driver=new IOSDriver(url,options);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://gl.ketobalanced.com/");
		driver.findElement(By.xpath("//*[text()='Man']")).click();
		driver.findElement(By.xpath("//*[text()='Extra']")).click();
		driver.findElement(By.xpath("//*[text()='Cut']")).click();
		driver.findElement(By.xpath("//*[text()='Lose weight']")).click();
		//Actions action =new Actions(driver);
		//action.scrollByAmount(0, 600).build().perform();
		driver.findElement(By.xpath("//*[text()='Sleep better']")).click();
		driver.findElement(By.xpath("//*[text()='Yes, I Got it']")).click();
		driver.findElement(By.xpath("//*[text()='Butt']")).click();
		driver.findElement(By.xpath("//*[text()='Belly']")).click();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.xpath("//*[text()='More than 4 years ago']")).click();
		driver.findElement(By.xpath("//*[text()='Up to 1 hour']")).click();
		//action.scrollByAmount(0, 800).build().perform();
		driver.findElement(By.xpath("//*[text()='I eat all']")).click();
		driver.findElement(By.xpath("//*[text()='Next ']")).click();
		driver.findElement(By.xpath("//*[text()='I eat all']")).click();
		//action.scrollByAmount(0, 1000).build().perform();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		//action.scrollByAmount(0, 1000).build().perform();
		driver.findElement(By.xpath("//*[text()='I eat all']")).click();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.xpath("//*[text()='I exercise 1-2 times a week']")).click();
		driver.findElement(By.xpath("//*[text()='At workplace']")).click();
		driver.findElement(By.xpath("//*[text()='I can not quit eating sweets']")).click();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		//action.scrollByAmount(0, 1000).build().perform();
		driver.findElement(By.xpath("//*[text()='None of the above']")).click();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.id("height_cm_id")).sendKeys("186");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.id("weight_lb")).sendKeys("240");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.id("target_lb")).sendKeys("190");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.id("age_yrs")).sendKeys("29");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.xpath("//*[text()='Beach trip']")).click();
		driver.findElement(By.id("mail-value")).sendKeys("keto@yopmail.com");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		//action.scrollByAmount(0, 800).build().perform();
		driver.findElement(By.xpath("//*[text()='Buy Now']")).click();
		
	}
	

}
