import javax.swing.JWindow;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndTest extends BaseTest {
// we have a class name End to End test where all classes are taking action.
// we use extends BaseTest to get all property such as ChromeDriver. 
@Test // key @Test is created which allows as to run pacific main method(Test)
	public void logIn()throws InterruptedException{
		HomePage hp = new HomePage(driver);
/*we created an object of HomePage giving reference name of hp so that we can us reference name to 
call the method to perform action(test)*/
		hp.VerifyHomepageLogo();
// by using reference name hp (HomePage) we call the method to perform action VerifyHomepageLogo
		hp.HoverOverOnMenMenu();
// by using reference name hp (HomePage) we call the method to perform action HoverOverOnMenMenu
		NewArrivalPage np = hp.clickOnNewArrival();
// we 
		ProductDetailPage pdp = np.clickOnMenShirt();
		pdp.selectSize();
// by using reference name pdp (ProductDetailPage) we call the method to perform action selectSize 
		pdp.selectColore();
// by using reference name pdp (ProductDetailPage) we call the method to perform action selectColore 
		pdp.addToCartButton();
// by using reference name pdp (ProductDetailPage) we call the method to perform action addToCartButton 

	}

@Test
public void logOut() {
	HomePage hp = new HomePage(driver);
	hp.HoverOverOnMenMenu();
	JewelryPage jp = hp.clickOnJewelry();
	jp.clickOnTypeFilter();
	}
}