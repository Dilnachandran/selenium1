package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage {
	
	//Declaration
	@FindBy(xpath="//h2[@class='list-title']")
	private WebElement pageHeader; 
	
	@FindBy(xpath="//a[text()='Core Java for Selenium Training']")
	private WebElement coreJavaForSelenium;
	
	//initialization
	
	public CoreJavaForSeleniumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public String getPageHeader()
	{
		return pageHeader.getText();
	}
	public void clickCoreJavaForSeleniumLink()
	{
		coreJavaForSelenium.click();
	}
}
