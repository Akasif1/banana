import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
/*public abstract class BaseTest ---> can not create an object because it 
will save some space in memory and can have implicit and nun implicit body*/

	
// abstract void eat();
	
/*static ChromeDriver driver = null;
--->static helps to same some memory. when you use static 
in instant variable it becomes
--->class variable it can be overloaded but not override
--->static method can be overloaded but not override
--->top class can not be static but inner class can be, 
this is called nested class.
--->static variable can not be local*/
	
	
	ChromeDriver driver = null;//
	@Before // before the code run, Chrome driver opens up
	   public void getDriver() {// we created a method to get Chrome browser
		   driver = new ChromeDriver();// this is built in function to open ChromeDriver 
		   driver.get("http://www.express.com");//telling driver to get the URL to open on express.com
		   driver.manage().window().maximize();// just letting chrome fix its size
		   driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);// to keep from open for 5 seconds 
	   }
	   
	@After // after we finish running the code we close the browser
	   public void closeBrowser() {// we create a method to close browser 
		   driver.quit();// driver quit means close the browser.
		
	}
}