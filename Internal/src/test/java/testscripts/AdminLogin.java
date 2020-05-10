package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import GlobalMethodPack.GlobalMethods;
import GlobalMethodPack.GlobalVariables;

public class AdminLogin  {


	  @BeforeMethod
	   public void beforeMethod() {
	 
		   GlobalMethods.openBrowser();
		   
}
	@Test
	public void VerifyLoginPage()throws Exception {
		Thread.sleep(2000);
		
		String heading= GlobalVariables.driver.findElement(By.xpath("//div/div/div[2]/div/div/h1")).getText();
		
		Assert.assertEquals(heading, "Welcome to Admin");
		
	}
	@Test
	public void VerifyLoginWithValidCredentials() throws InterruptedException {
	    Thread.sleep(2000);
		
		WebElement username= GlobalVariables.driver.findElement(By.xpath("//*[@id='email']"));
		 username.click();
		 username.sendKeys("voteforguy@gmail.com");
		 
		 Thread.sleep(2000);
		 WebElement password= GlobalVariables.driver.findElement(By.xpath("//input[@id='password']"));
		 password.click();
		 password.sendKeys("test1234");
		 
		 Thread.sleep(2000);
		 GlobalVariables.driver.findElement(By.xpath("//button[@class='btn btn-sm btn-hero btn-alt-primary']")).click();
		 
		 Thread.sleep(2000);
		 String dasboard= GlobalVariables.driver.findElement(By.xpath("//span[contains(text(),'Tantra')]")).getText();
		 
		 Assert.assertEquals(dasboard, "Tantra");
		 
		 	}
	
	@Test
	public void VerifyLoginWithInValidCredentials() throws InterruptedException {
	    Thread.sleep(2000);
		
		WebElement username= GlobalVariables.driver.findElement(By.xpath("//*[@id='email']"));
		 username.click();
		 username.sendKeys("invalidusername");
		 
		 Thread.sleep(2000);
		 WebElement password= GlobalVariables.driver.findElement(By.xpath("//input[@id='password']"));
		 password.click();
		 password.sendKeys("test1234");
		 
		 Thread.sleep(2000);
		 GlobalVariables.driver.findElement(By.xpath("//button[@class='btn btn-sm btn-hero btn-alt-primary']")).click();
		 
		 Thread.sleep(2000);
		 String dasboard= GlobalVariables.driver.findElement(By.xpath("//span[contains(text(),'Tantra')]")).getText();
		 
		 Assert.assertEquals(dasboard, "Tantra");
		 
		 	}
	@Test
	public void VerifyLoginWithInValidUsername() throws InterruptedException {
	    Thread.sleep(2000);
		
		WebElement username= GlobalVariables.driver.findElement(By.xpath("//*[@id='email']"));
		 username.click();
		 username.sendKeys("invalidusername");
		 
		 Thread.sleep(2000);
		 WebElement password= GlobalVariables.driver.findElement(By.xpath("//input[@id='password']"));
		 password.click();
		 password.sendKeys("Test1234");
		 
		 Thread.sleep(2000);
		 GlobalVariables.driver.findElement(By.xpath("//button[@class='btn btn-sm btn-hero btn-alt-primary']")).click();
		 
		 Thread.sleep(2000);
		 String dasboard= GlobalVariables.driver.findElement(By.xpath("//div[contains(text(),'Please enter a valid email address.')]")).getText();
		 
		 Assert.assertEquals(dasboard, "Please enter a valid email address.");
		 
		 	}
	
	
	@Test
	public void VerifyForgotpassword() throws InterruptedException {
	    Thread.sleep(2000);
		
		WebElement frgt= GlobalVariables.driver.findElement(By.xpath("//a[@class='link-effect text-muted mr-10 mb-5 d-inline-block']"));
		frgt.click();
		
		
		 Thread.sleep(3000);
		 String dasboard= GlobalVariables.driver.findElement(By.xpath("//h1[contains(text(),'Don’t worry, we’ve got your back')]")).getText();
		 
		 Assert.assertEquals(dasboard, "Don’t worry, we’ve got your back");
		 
		 	}
	
	  @AfterMethod
	  public void closeBrowser()
	  {
		  GlobalVariables.driver.close();
	  }     
	  }

	 
			

