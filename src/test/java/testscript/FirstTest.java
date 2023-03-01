package testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FirstTest extends BaseClass{

	@Test
	public void firstTest() 
	{
		//click on gears tab
		SoftAssert soft = new SoftAssert();
		
		
		home.clickGears();
		home.clickSkillraryDemoApp();
		web.switchToChildBrowser();
		
		soft.assertEquals(demoapp.getPageHeader(), "SkillRary-ECommerce");
		demoapp.mouseHoverToCourse(web);
		demoapp.clickSeleniumTraining();
		
		soft.assertEquals(demoapp.getPageHeader(), "Selenium Training");
		selenium.doubleClickPluseButton(web);
		selenium.clickAddToCart();
		web.handleAlert();
		
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		
		soft.assertAll();
		
		
	}
}
