import java.awt.Desktop.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Helper {
	public static boolean VerifyElement(WebElement element) {
		return element.isDisplayed();
	}
	public static void hoverOverOnElement(ChromeDriver driver, WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	public static void click (WebElement element) {
		element.click();
	}
	public static void selectFromDropdown(WebElement element,String option) {
		Select s = new Select(element);
		s.selectByVisibleText(option);
	}

}