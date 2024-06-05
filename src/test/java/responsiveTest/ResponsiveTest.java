package responsiveTest;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseHelper.SetUp;

public class ResponsiveTest extends SetUp {
	@Test
	public void man() {
		gender.man();
		driver.findElement(By.xpath("//*[text()='Extra']")).click();
		driver.findElement(By.xpath("//*[text()='Cut']")).click();
		driver.findElement(By.xpath("//*[text()='Lose weight']")).click();
		Actions action =new Actions(driver);
		action.scrollByAmount(0, 600).build().perform();
		driver.findElement(By.xpath("//*[text()='Sleep better']")).click();
		driver.findElement(By.xpath("//*[text()='Yes, I Got it']")).click();
		driver.findElement(By.xpath("//*[text()='Butt']")).click();
		driver.findElement(By.xpath("//*[text()='Belly']")).click();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.xpath("//*[text()='More than 4 years ago']")).click();
		driver.findElement(By.xpath("//*[text()='Up to 1 hour']")).click();
		action.scrollByAmount(0, 800).build().perform();
		driver.findElement(By.xpath("//*[text()='I eat all']")).click();
		driver.findElement(By.xpath("//*[text()='Next ']")).click();
		driver.findElement(By.xpath("//*[text()='I eat all']")).click();
		action.scrollByAmount(0, 1000).build().perform();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		action.scrollByAmount(0, 1000).build().perform();
		driver.findElement(By.xpath("//*[text()='I eat all']")).click();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.xpath("//*[text()='I exercise 1-2 times a week']")).click();
		driver.findElement(By.xpath("//*[text()='At workplace']")).click();
		driver.findElement(By.xpath("//*[text()='I can not quit eating sweets']")).click();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		action.scrollByAmount(0, 1000).build().perform();
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
		action.scrollByAmount(0, 800).build().perform();
		driver.findElements(By.xpath("//*[text()='Buy Now']")).get(1).click();
	}
	
	@Test
	public void woman() {
		gender.woman();
		driver.findElement(By.xpath("//*[text()='Average']")).click();
		driver.findElement(By.xpath("//*[text()='Cut']")).click();
		driver.findElement(By.xpath("//*[text()='Lose weight']")).click();
		Actions action =new Actions(driver);
		action.scrollByAmount(0, 600).build().perform();
		driver.findElement(By.xpath("//*[text()='Sleep better']")).click();
		driver.findElement(By.xpath("//*[text()='Yes, I Got it']")).click();
		driver.findElement(By.xpath("//*[text()='Butt']")).click();
		driver.findElement(By.xpath("//*[text()='Belly']")).click();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.xpath("//*[text()='More than 4 years ago']")).click();
		driver.findElement(By.xpath("//*[text()='Up to 1 hour']")).click();
		action.scrollByAmount(0, 800).build().perform();
		driver.findElement(By.xpath("//*[text()='I eat all']")).click();
		driver.findElement(By.xpath("//*[text()='Next ']")).click();
		driver.findElement(By.xpath("//*[text()='I eat all']")).click();
		action.scrollByAmount(0, 1000).build().perform();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		action.scrollByAmount(0, 1000).build().perform();
		driver.findElement(By.xpath("//*[text()='I eat all']")).click();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.xpath("//*[text()='I exercise 1-2 times a week']")).click();
		driver.findElement(By.xpath("//*[text()='At workplace']")).click();
		driver.findElement(By.xpath("//*[text()='I can not quit eating sweets']")).click();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		action.scrollByAmount(0, 1000).build().perform();
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
		action.scrollByAmount(0, 800).build().perform();
		driver.findElements(By.xpath("//*[text()='Buy Now']")).get(1).click();
	}

}
