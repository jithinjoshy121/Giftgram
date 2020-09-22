package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import data.DataFile;
import pages.GiftPage;

public class GiftTest extends TestBase{
	
	GiftPage gp;
	DataFile df;
	
	

	 public GiftTest()  {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	  public void beforeMethod() throws Exception {
		initialization();
		gp=new GiftPage();
		df=new DataFile();
		
			

	  }
	 
	 @AfterMethod
	  public void afterMethod() {
		 closeBrowser();
	  }
	 
	 @Test
	  public void verifyTitle() throws InterruptedException 
	  {
		 
			Assert.assertEquals(gp.getTitle1(),df.title);
	  }
	 
	 @Test
	  public void verifyPrice() throws InterruptedException 
	  {
		 
			Assert.assertEquals(gp.productPrice.getText(),df.price);
	  }
	 
	@Test
	  public void saveEngrave() throws InterruptedException 
	  {
		 
			gp.enterEngrave(df.name);
			gp.save.click();
			
			Assert.assertEquals(gp.saveConfirm.getText(),df.name);
	  }
	
	 @Test
	  public void cancelEngrave() throws InterruptedException 
	  {
		 
			gp.enterEngrave(df.name);
			gp.cancel.click();
			Assert.assertEquals(gp.engraveText.getText(),df.text);
	  }
	 
	 @Test
	 public void sendGift() throws InterruptedException 
	  {
		 
			gp.enterEngrave(df.name);
			gp.save.click();
			gp.send.click();
			Thread.sleep(3000);
		    
		    
			
			Assert.assertEquals(driver.getTitle(),df.title2);
			
			
	
	  }
	 
	 @Test
	 public void buyYourself() throws InterruptedException 
	  {
		 
			gp.enterEngrave("Jithin");
			gp.save.click();
			gp.buy.click();
			Thread.sleep(3000);
		   
			Assert.assertEquals(driver.getTitle(),df.title2);
			
			
	
	  }
	 
	
	

}
