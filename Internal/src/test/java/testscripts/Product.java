package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethodPack.GlobalMethods;
import GlobalMethodPack.GlobalVariables;

public class Product {

	  @BeforeMethod
	   public void beforeMethod() throws InterruptedException {
	 
		   GlobalMethods.openBrowser();
		   GlobalMethods.Login();
		   
}
	  
	  @Test
	  public void VerifyAddProduct()throws Exception{
		  Thread.sleep(3000);
		  GlobalVariables.driver.findElement(By.xpath("//span[@class='sidebar-mini-hide' and contains(text(),'Products')]")).click();
		  
		  Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='main-container']/div/h2/div/a")).click();
		   
		   Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='product_name']")).sendKeys("NivTestProduct07");
		   
		   Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='product_sub_name']")).sendKeys("csfsfsfs");
		   
		   Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='product_abbreviation']")).sendKeys("43wrsfsw");
		   
		   Thread.sleep(3000);
		 WebElement getBrand=  GlobalVariables.driver.findElement(By.xpath("//div[1]/div[2]/div[2]/div[2]/div/span/span[1]/span/ul/li/input"));
		 getBrand.sendKeys("Tushar");
		 Thread.sleep(2000);
		 getBrand.sendKeys(Keys.ENTER);
		   
		   Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='default_duration']")).sendKeys("4");
		   
		 
		   //USING SELECT BY VALUE
		   Thread.sleep(3000);
		   Select oSelect =new Select( GlobalVariables.driver.findElement(By.id("default_pricing")));
		   oSelect.selectByValue("3");
		   
		   Thread.sleep(3000);
		   Select oSelect1 =new Select( GlobalVariables.driver.findElement(By.id("status")));
		   oSelect1.selectByValue("active");
		  
		   Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//button[@class='btn btn-alt-primary btn-save js-click-ripple-enabled']")).click();
	 
	  Thread.sleep(5000);
	 
	  
	  String nameadded=  GlobalVariables.driver.findElement(By.xpath("//div[contains(text(),'NivTestProduct07')]")).getText();
	  
	  Assert.assertEquals(nameadded, "NivTestProduct07");
		 
	  
	  }
	  
	  @Test
	  public void VerifyEditProduct()throws Exception{
		  
		  GlobalVariables.driver.findElement(By.xpath("//span[@class='sidebar-mini-hide' and contains(text(),'Products')]")).click();
		  Thread.sleep(3000);
		  
		  //click on the edit icon
		  GlobalVariables.driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div/a[2]")).click();
		  Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='product_name']")).clear();
		   
		  
		  Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='product_name']")).sendKeys("Edited24");
		   
		   Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//button[@class='btn btn-alt-primary btn-save js-click-ripple-enabled']")).click();
	 
		   
		   Thread.sleep(5000);
			 
			  
			  String nameadded=  GlobalVariables.driver.findElement(By.xpath("//div[contains(text(),'Edited24')]")).getText();
			  
			  Assert.assertEquals(nameadded, "Edited24");
				 
		  
		  
	  }
	  
	  @Test
	  public void VerifyDeleteProduct() throws InterruptedException {
		  GlobalVariables.driver.findElement(By.xpath("//span[@class='sidebar-mini-hide' and contains(text(),'Products')]")).click();
		  Thread.sleep(3000);
		  
		  //click on the delete icon
          GlobalVariables.driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div/a[2]")).click();
		  
		  Thread.sleep(3000);
		 //button[contains(text(),'OK')]
		  GlobalVariables.driver.findElement(By.xpath("button[contains(text(),'OK')]")).click();
			 
		 //verify cross button is enabled
        WebElement btn=  GlobalVariables.driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a"));
        btn.click();
        
        Assert.assertTrue(btn.isEnabled());
          
          
		  
		  
	  }
	  
	  @AfterMethod
	  public void closeBrowser()
	  {
		  GlobalVariables.driver.close();
	  }     

}
