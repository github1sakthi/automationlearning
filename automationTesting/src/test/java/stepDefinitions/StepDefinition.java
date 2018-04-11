package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinition {
	protected WebDriver webDriver = null;
	WebDriverWait wait = null;
	public StepDefinition(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
		this.webDriver =webDriver;		
	}
}
