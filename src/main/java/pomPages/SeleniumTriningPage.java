package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SeleniumTriningPage {

	//Declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	@FindBy(id="add")
	private WebElement plusButton;
	@FindBy(xpath="//button[.=' Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(xpath="//div[@id='callout']")
	private WebElement itemAddedMessage;
	
	//initialization
	
	public SeleniumTriningPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public String getPageHeader()
	{
		return pageHeader.getText();
	}
	public void doubleClickPluseButton(WebDriverUtility web)
	{
		web.doubleClickOnElement(plusButton);
	}
	public void clickAddToCart()
	{
		addToCartButton.click();
	}
	public WebElement getItemAddedMessage()
	{
		return itemAddedMessage;
	}

	
}
