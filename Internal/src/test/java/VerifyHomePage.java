import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import GlobalMethodPack.GlobalMethods;
import GlobalMethodPack.GlobalVariables;

public class VerifyHomePage {

	public static void main(String[] args) throws InterruptedException {
		GlobalMethods.openBrowser();
		GlobalMethods.Login();
		
		Thread.sleep(3000);
		
		  GlobalVariables.driver.findElement(By.xpath("//span[@class='sidebar-mini-hide' and contains(text(),'Products')]")).click();
		  Thread.sleep(3000);
		  
		  //click on the edit icon
		  GlobalVariables.driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div/a[2]")).click();
		  Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='product_name']")).clear();
		   
		  
		  Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='product_name']")).sendKeys("EditedBrand");
		   
		   Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//button[@class='btn btn-alt-primary btn-save js-click-ripple-enabled']")).click();
	 
		   
		   Thread.sleep(5000);
			 
			  
			  String nameadded=  GlobalVariables.driver.findElement(By.xpath("//div[contains(text(),'EditedBrand')]")).getText();
			  
			  Assert.assertEquals(nameadded, "EditedBrand");
			  System.out.print("done");
				 
		}}
