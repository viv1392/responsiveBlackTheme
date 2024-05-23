package blackWebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenderSelection {
	WebDriver driver;
	public GenderSelection(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div/h3")
	List<WebElement> eles;
	
	public void man() {
		eles.get(0).click();
	}
	public void woman() {
		eles.get(1).click();
	}

}
