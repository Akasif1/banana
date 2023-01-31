import java.awt.print.Printable;

import org.hamcrest.core.StringEndsWith;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class Ifclass {
	
	ChromeDriver driver;
	
	public void singleCondition() {
		if (driver.findElement(By.id("copy the id here")).isDisplayed()) {
		System.out.println("contion is True");
		}
			else {
				System.out.println("condition is not True");
			} 
		
	}
	
		
		public void multipleCondition() {
			if (driver.getCurrentUrl().equals("http//www.amazon.com")) {
				System.out.println("print hello1");
			}
			
				else if (driver.findElement(By.id("copy the id")).isEnabled()) {
					System.out.println("print hello2");
				}
					
					else if (driver.findElement(By.xpath("the xpath")).isSelected()) {
						System.out.println("print hello3");
						}
						else {
							System.out.println("Print hello4  ");
						}
					}
		public void switchStatement() {
			String result;
			switch(result) {
			case result = 
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
}