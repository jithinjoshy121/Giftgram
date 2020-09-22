package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class GiftPage extends TestBase{
	


	public GiftPage()  {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='link logo bg-image']")
	public static WebElement title;
	
	@FindBy(xpath="//h1[@class='h3']")
	public static WebElement productTitle;
	
	@FindBy(xpath="//h4[@class='price']")
	public static WebElement productPrice;
	
	
	@FindBy(xpath="//h4[@class='margin-bottom-0']")
	public static WebElement engraveText;
	
	@FindBy(xpath="//input[@id='line_0']")
	public static WebElement engraveLine;
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	public static WebElement save;
	
	@FindBy(xpath="//span[contains(text(),'Cancel')]")
	public static WebElement cancel;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/a[1]/span[1]")
	public static WebElement saveConfirm;
	
	@FindBy(xpath="//a[@class='btn greenButton form-button w-100 link not-in-progress']")
	public static WebElement send;
	
	@FindBy(xpath="//a[@class='btn whiteButton form-button w-100 link not-in-progress']")
	public static WebElement buy;
	

	
	
	public void enterEngrave(String text)
	{
		engraveText.click();
		engraveLine.sendKeys(text);
		
		
	}
	
	public String getTitle1()
	{
		
		return driver.getTitle();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
