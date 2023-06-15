package Generic;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class WebGeneric {
	public void verifyURL(WebDriver driver, String expectedURL) {
		String actualURL = driver.getCurrentUrl();
		if(actualURL.equals(expectedURL))
			Reporter.log("page verified",true);
		else
			Reporter.log("pafe not verified",true);
	}
	public void verifyTitle(WebDriver driver, String expectedTitle) {
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle))
			Reporter.log("page verified",true);
		else
			Reporter.log("pafe not verified",true);
	}
	public int rendomNumber() {
		Random r=new Random();
		return r.nextInt();
	}
}