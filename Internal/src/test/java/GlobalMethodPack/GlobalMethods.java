package GlobalMethodPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class GlobalMethods {
	
	
	
	public static void openBrowser() {
		
		 System.setProperty("webdriver.chrome.driver", "H:\\Automation\\chromedriver.exe");
	 	 GlobalVariables.driver= new ChromeDriver(); 
	 	GlobalVariables.driver.get(GlobalVariables.Baseurl);
		 
	}
	
	public static void Login() throws InterruptedException {
		Thread.sleep(5000);
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
	}
	
	public static void AddProduct() throws InterruptedException {
		  Thread.sleep(3000);
		  GlobalVariables.driver.findElement(By.xpath("//span[@class='sidebar-mini-hide' and contains(text(),'Products')]")).click();
		  
		  Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='main-container']/div/h2/div/a")).click();
		   
		   Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='product_name']")).sendKeys("NivTestProduct1");
		   
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
	}
	
	

}
