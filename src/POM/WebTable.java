package POM;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Browser;

public class WebTable {
		public static void main(String[] args) {
			WebDriver drivers =Browser.OpenBrowser("https://demo.guru99.com/test/web-table-element.php");
			List<WebElement> row = drivers.findElements(By.xpath("//table//tbody//tr"));
			
			List<WebElement> column =drivers.findElements(By.xpath("//table//thead//tr//th"));
			double max=0;
			double baseprice =0;
			
			for(int i=1;i<=row.size();i++)
			{
				WebElement CurrentPrice = drivers.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]"));
				String Price= CurrentPrice.getText();
				
				
				
				max = Double.parseDouble(Price);
				if(max > baseprice)
				{
					baseprice = max;
				}
				
			}
			System.out.println("Maximum current price is "+ baseprice);
		}
}
