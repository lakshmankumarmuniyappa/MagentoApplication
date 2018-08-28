

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
     WebDriver driver;

	
     
     
     By myacc = By.linkText("My Account");
     public Home(WebDriver driver) 
     {
		this.driver = driver;
		System.out.println("data is pushed");
	 }
    
     public void clickOnMyacc()
     {
    	 driver.findElement(myacc).click();
     }
     
}   
     
     
     
     
 
