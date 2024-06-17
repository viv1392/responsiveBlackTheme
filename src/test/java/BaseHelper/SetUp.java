package BaseHelper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import appUtilities.Utilities;
import blackWebPages.GenderSelection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SetUp {
	private UiAutomator2Options options;
	public WebDriver driver;
	public GenderSelection gender;

	public WebDriver setUp() throws URISyntaxException, IOException {
		options = new UiAutomator2Options();
		options.setChromedriverExecutable(System.getProperty("user.dir") + "//resources//chromedriver.exe");
		options.setDeviceName("Android Device");
		options.setCapability("browserName", "Chrome");
		// URL url = new URL(Utilities.localHostUrl()); // deprecated method

		URI localUri = new URI(Utilities.localHostUrl());
		URL localUrl = localUri.toURL();
		driver = new AndroidDriver(localUrl, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}
	@BeforeMethod
	public GenderSelection siteSearch() throws URISyntaxException, IOException {
		driver=setUp();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("https://gl.ketobalanced.com/usa");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		WebElement ele=driver.findElement(By.xpath("//*[text()='Keto Balanced']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		gender=new GenderSelection(driver);
		return gender;
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
