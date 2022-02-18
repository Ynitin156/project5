package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class elements 
{
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[1]/ul/li[1]/span")    
	public static WebElement click1;
	
	@FindBy(name="username")    
	public static WebElement text1;
	
	@FindBy(xpath="//input[@type='submit']")    
	public static WebElement click2;
	
	@FindBy(xpath="//input[@type='submit']")    
	public static WebElement click3;
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/div/input")    
	public static WebElement search1;
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/button/span")    
	public static WebElement Click4;
	
	@FindBy(xpath="//*[@id=\"products\"]/div[3]/div[1]/div/div[1]/a/div/div[1]/img")    
	public static WebElement search5;
	
	@FindBy(xpath ="//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div/div/div[3]/div/span")    
	public static WebElement click5;
	
	@FindBy(xpath ="//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[9]/div[1]/div[1]/div")    
	public static WebElement click6;
	
	
	
	
	
	

	

	
	
}
