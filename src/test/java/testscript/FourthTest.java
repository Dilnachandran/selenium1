package testscript;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FourthTest extends BaseClass {

	@Test
	public void fourthTest()
	{
		SoftAssert soft = new SoftAssert();
		
		home.clickGears();
		home.clickSkillraryDemoApp();
		web.switchToChildBrowser();
		
		
		soft.assertEquals(demoapp.getPageHeader(), "SkillRary-ECommerce");
		
		web.scrollToElement(demoapp.getContactUs());
		demoapp.clickContactUs();
		
		soft.assertTrue(contact.getPageHeader().isDisplayed());
		List<String> dataList = excel.readDataFromExcel("Sheet1");
		contact.sendContactDetails(dataList.get(0), dataList.get(1), dataList.get(2), dataList.get(3));
		soft.assertAll();
		
	}
}
