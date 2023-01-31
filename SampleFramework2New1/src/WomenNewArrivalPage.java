import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WomenNewArrivalPage {
	ChromeDriver driver;
	
	public WomenNewArrivalPage(ChromeDriver x) {
		driver = x;
	}
	
	public void clickOnFirstProduct() {
		Helper.click(driver.findElement(By.xpath("xpathOfFirstPRuduct")));
	}

}