package aws;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class AmazonWeb {
	WebDriver driver;
  @Test
  public void AmazonTest() throws InterruptedException {
	  //click on amazon selection list
	  new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
				(By.cssSelector("div.aws-nav-popover-trigger:nth-child(2)"))).click();
	  //clikc on management console
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
			(By.cssSelector("#aws-nav-dropdown-account > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)"))).click();
	//type in email
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
			(By.xpath("//input[@id='ap_email']"))).sendKeys("jasonsouryamath@yahoo.com");
	//type in password
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
			(By.xpath("//input[@id='ap_password']"))).sendKeys("jassour17");
	//press submit
	driver.findElement(By.id("signInSubmit-input")).submit();
//type EC2 into the search input 
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
			(By.xpath("//input[@id='search-box-input']"))).sendKeys("EC2");
	//clikc the first result to appear
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
			(By.xpath("//*[@id='search-box-item-0-title']"))).click();
	
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
			(By.cssSelector(".gwt-Button"))).click();
	
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
			(By.xpath("//*[@id='gwt-uid-2365:selectButton']"))).click();
	
	Thread.sleep(2000);
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
			(By.cssSelector(".J5"))).click();
	
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
					(By.cssSelector(".OX > div:nth-child(3) > button:nth-child(1)"))).click();

	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
			(By.cssSelector("#gwt-uid-1860"))).click();
	Thread.sleep(1000);
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
			(By.cssSelector(".I2B > div:nth-child(2) > button:nth-child(1)"))).click();
	
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\jsouryamath\\Desktop\\chromedriver.exe");
   driver =new ChromeDriver();
	  driver.get("https://aws.amazon.com/");
	  
	  
  }

 

}
