AmazonWeb
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
			(By.cssSelector("#gwt-uid-1860"))).click();
	Thread.sleep(1000);
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
			(By.cssSelector(".I2B > div:nth-child(2) > button:nth-child(1)"))).click();
	Thread.sleep(1000);
	new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated
			(By.cssSelector("div.IQ:nth-child(6) > div:nth-child(2) > button:nth-child(1)"))).click();
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\jsouryamath\\Desktop\\chromedriver.exe");
   driver =new ChromeDriver();
	  driver.get("https://aws.amazon.com/");
	  
	  
  }

 

}

