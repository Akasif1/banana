import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import graphql.PublicApi;

public class HomePage {
// this is a HomePage class were we perform all the action possible in home page.
	
/*final class can't be inheritance but can inheritance, if method is final
it can not be override.
--->if variable is final it's called constant variable which can not 
be changed.*/ 
	
	ChromeDriver driver;
// we are calling ChromeDriver
	
@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/a/img") WebElement homePageLogo;
// find notation are provided by PageFactory. we are we writing xpath of homePageLogo globally
@FindBy(xpath = "//*[@id=\"raven-header-mega-menu\"]/nav/ol/li[2]/a") WebElement menMenuCatagory;
//we are we writing xpath of menMenuCatagory globally
@FindBy(xpath = "//*[@id=\\\"root-Men\\\"]/ol[2]/li[1]/ol/li[1]/a") WebElement womenMenu;
//we are we writing xpath of womenMenu globally

	
	public HomePage(ChromeDriver x) {
		driver = x;
// we assigned driver to x value 
		PageFactory.initElements(driver, this);
/* PageFactory is a build-in class in selenium webDriver. supports design pattern by initializing 
object (example in EndToEnd) when you create an object in in landing page(EndToEnd) the constructor 
will be called from*/
	}
	
	public void VerifyHomepageLogo() {
		boolean result = Helper.VerifyElement(homePageLogo);
		
	}
	
	public void HoverOverOnMenMenu() {
		Helper.hoverOverOnElement(driver, menMenuCatagory);
	}

	public NewArrivalPage clickOnNewArrival() {
		
		Helper.click(driver.findElement(By.xpath("//*[@id=\"root-Men\"]/ol[2]/li[1]/ol/li[1]/a")));
		return new NewArrivalPage(driver);
	}
	
	public void HoverOverOnWomenMenu() {
		Helper.hoverOverOnElement(driver, womenMenu);
	}
	
	public JewelryPage clickOnJewelry() {
		Helper.click(driver.findElement(By.xpath("xpathOfNewArrival")));
		return new JewelryPage(driver);
	}
	
	// abstract void eat(); normal class can only have implemented 
	// abstract int a = 9; ---> abstract variable is not possible
	
	
}
