package functionality;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import objectRepository.elements;


@Test
public class login 
{
  public void login() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\nitin.yadav\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.ajio.com/shop/men");
	  driver.manage().window().maximize();
	  
	  PageFactory.initElements(driver,elements.class);
	  
	  
	  Thread.sleep(2000);
	  elements.click1.click();
	  
	  elements.text1.sendKeys("9910305181");
	  elements.click2.click();
	  
	  Thread.sleep(30000);
	  elements.click3.click();
	  
	  elements.search1.sendKeys("Puma Shoes For Mens");
	  elements.Click4.click();
	  elements.search5.click();
	  
	  
	  
	  String w1=driver.getTitle();
	  Set<String> windows=driver.getWindowHandles();
	  Iterator<String> iter=windows.iterator();
	  String Window1=iter.next();
	  String Window2=iter.next();
	  driver.switchTo().window(Window2);
	  String w2=driver.getTitle();
	  System.out.println(w1);
	  System.out.println(w2);
	  System.out.println(Window1);
	  System.out.println(Window2);
	  
	  
	  
	  
	  JavascriptExecutor jse= (JavascriptExecutor) driver;
      jse.executeScript("scroll(0,350)");
	  
	  elements.click5.click();
	  elements.click6.click();
	  
	 
	 
	 
	 
  }
}
