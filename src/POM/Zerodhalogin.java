package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodhalogin {

		@FindBy(xpath = "//input[@id='userid']") private WebElement name;
		//driver.findElement
		@FindBy(xpath = "//input[@id='password']") private WebElement pass;
		@FindBy(xpath="//button[@type='submit']") private WebElement submit;
		@FindBy(xpath="//input[@type='password']") private WebElement pin;
		@FindBy(xpath="//button[@type='submit']") private WebElement pinsubmit;


		public Zerodhalogin(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		public void enterUserName(String user) {
			name.sendKeys(user);
		}
		public void enterPassword(String Pass) {
			pass.sendKeys(Pass);
		}
		public void clickOnSubmit() {
			submit.click();
		}
		public void enterPin(String Pin) {
			pin.sendKeys(Pin);
		}
		public void clickOnPin() {
			pinsubmit.click();
		}




		}




