package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Zerodhalogin;
import Utility.Browser;


public class LoginTest {

		WebDriver driver;

		@BeforeMethod
		public void CallBrowser() {
			driver = Browser.OpenBrowser("https://kite.zerodha.com");
		}
		@Test
		public void LginWithCredentials() {
			Zerodhalogin zerodhalogin = new Zerodhalogin(driver);
			zerodhalogin.enterUserName("OKP335");
			zerodhalogin.enterPassword("QAZ123456");
			zerodhalogin.clickOnSubmit();
			zerodhalogin.enterPin("456789");
			zerodhalogin.clickOnPin();

		}

		@Test
		public void LoginWithoutCredentials() {
			Zerodhalogin zerodhalogin = new Zerodhalogin(driver);
			zerodhalogin.clickOnSubmit();
		}
	
}
