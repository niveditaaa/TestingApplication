package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethodPack.GlobalMethods;
import GlobalMethodPack.GlobalVariables;

public class Brand {
	////span[@class='sidebar-mini-hide' and contains(text(),'Brands')]
	
	  @BeforeMethod
	   public void beforeMethod() throws InterruptedException {
	 
		   GlobalMethods.openBrowser();
		   GlobalMethods.Login();
		   
}
	  
	  @Test
	  public void VerifyAddBrand()throws Exception{
		  Thread.sleep(3000);
		  GlobalVariables.driver.findElement(By.xpath("//span[@class='sidebar-mini-hide' and contains(text(),'Brands')]")).click();
		  
		  Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='main-container']/div/h2/div/a")).click();
		   
		   Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='name']")).sendKeys("NivTestBrand");
		   
		   Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Niv@mailinator.com");
		   
		   //USING SELECT BY VALUE
		   Thread.sleep(3000);
		   Select oSelect =new Select( GlobalVariables.driver.findElement(By.id("status")));
		   oSelect.selectByValue("active");
		  
		   GlobalVariables.driver.findElement(By.xpath("//button[@class='btn btn-alt-primary btn-save js-click-ripple-enabled']")).click();
	 
	  //I AM UNABLE TO VERIFY AS BRAND ADDED IS NOT DISPLAYED IN THE TABLE
	  
	  }
	  
	  @AfterMethod
	  public void closeBrowser()
	  {
		  GlobalVariables.driver.close();
	  }     
}
