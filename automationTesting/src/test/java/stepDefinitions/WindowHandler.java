package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.TestUtils;

public class WindowHandler {
WebDriver driver;
String parent;
	@Given("^Html page is loaded$")
	public void html_page_is_loaded() throws Throwable {
		

		driver=TestUtils.loadDriver();
		driver.get("file:///c:/Users/devis/git/automationlearning/automationTesting/testHtml/windowHandle.html");
		parent=driver.getWindowHandle();
	}

	@When("^User clicks on child a child window open$")
	public void user_clicks_on_child_a_child_window_open() throws Throwable {
		parent=driver.getWindowHandle();
		driver.findElement(By.id("childWin")).click();
	}

	@When("^Webdriver control switches to the child window$")
	public void webdriver_control_switches_to_the_child_window() throws Throwable {
		// This will return the number of windows opened by Webdriver and will return Set of St//rings
		Set<String>s1=driver.getWindowHandles();
		// Now we will iterate using Iterator
		Iterator<String> I1= s1.iterator();
		 
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		 
		// Here we will compare if parent window is not equal to child window then we            will close
		 
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		driver.manage().window().maximize();
		System.out.println(driver.switchTo().window(child_window).getTitle());
		 
		
		}
		 
		}
	}

	@When("^Logs into the application loaded in child window$")
	public void logs_into_the_application_loaded_in_child_window() throws Throwable {
		driver.findElement(By.id("identifierId")).sendKeys("testcucumberSelinium");
		driver.findElement(By.id("identifierNext")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("2018test");
		driver.findElement(By.id("passwordNext")).click();

				WebElement inboxCheck =driver.findElement(By.cssSelector("a.J-Ke.n0"));
		assertTrue(inboxCheck.getText().equals("Inbox (1)"));
		
	}

	@Then("^Closes the child window$")
	public void closes_the_child_window() throws Throwable {
		driver.close();
	}

	@Then("^control moves back to parent window$")
	public void control_moves_back_to_parent_window() throws Throwable {

		// once all pop up closed now switch to parent window
		driver.switchTo().window(parent);
		driver.findElement(By.id("googlelink")).click();
	}


}
