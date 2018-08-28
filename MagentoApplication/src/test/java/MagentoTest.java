

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest 

{

	
	
	
	@Test
	public void magentoTest() throws Exception
	{
		String url ="http://www.magento.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		Home h = new Home(driver);
		h.clickOnMyacc();
	    Thread.sleep(2000);
	    
	    Login l = new Login(driver);
	    l.typeEmail("subramanyaraj87@gmail.com");
	    Thread.sleep(2000);
		l.typePassWord("Welcome123");
		Thread.sleep(2000);
		l.clickLogin();
		
		Main m = new Main(driver);
		m.clickLogOut();
		
		Thread.sleep(2000);
		driver.quit();
				
	}
	
}
