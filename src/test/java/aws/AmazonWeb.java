package aws;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class AmazonWeb {
	WebDriver driver;
  @Test
  public void AmazonTest() {
	  
	  new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
				(By.cssSelector("div.aws-nav-popover-trigger:nth-child(2)"))).click();
	  
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
			(By.xpath("//a[@href='https://portal.aws.amazon.com/gp/aws/manageYourAccount?nc2=h_m_ma"))).click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.firefox.bin","/Users/jasonsouryamath/Desktop/FirefoxDeveloperEdition.app/Contents/MacOS/firefox-bin");
	  driver = new FirefoxDriver();
	  driver.get("https://aws.amazon.com/");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
