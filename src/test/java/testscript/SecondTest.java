package testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class SecondTest extends BaseClass {

	@Test
	public void secondTest()
	{
		SoftAssert soft = new SoftAssert();
		
		home.clickGears();
		home.clickSkillraryDemoApp();
		web.switchToChildBrowser();
		
		
		soft.assertEquals(demoapp.getPageHeader(), "SkillRary-ECommerce");
		demoapp.selectCategory(web, 1);
		
		soft.assertEquals(testing.getPageHeader(), "Testing");//checkig page is appearing or not
		web.dragAndDropElement(testing.getJavaImage(), testing.getMyCartArea());
		web.scrollToElement(testing.getFaceBookIcon());
		testing.clickFaceBookIcon();
		soft.assertAll();
		
		
		
		
	}
}
