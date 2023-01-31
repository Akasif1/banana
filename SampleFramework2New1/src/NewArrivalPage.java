import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NewArrivalPage {
	ChromeDriver driver;
	@FindBy(xpath = "xpath of anyMenShirt") WebElement menShirt;
	
	public NewArrivalPage(ChromeDriver x) {
		driver = x;
		PageFactory.initElements(driver, this);
	}

	public ProductDetailPage clickOnMenShirt() {
		Helper.click(menShirt);
		return new ProductDetailPage(driver);
	}
}