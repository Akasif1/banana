import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductDetailPage {
	ChromeDriver driver;
	@FindBy(xpath = "xpath of anyMenShirt") WebElement menShirt;
	
	public ProductDetailPage (ChromeDriver x) {
		driver = x;
		PageFactory.initElements(driver, this);
	}
	
	public void selectSize() {		
		
	}
	
	public void selectColore() {
		}

	public void addToCartButton() {
		
	}


}

