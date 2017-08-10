package ru.parsentev.app;



import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class EbayAdvancedSearch {


	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		 driver = new FirefoxDriver();
		String baseUrl = "http://www.google.com/";
		//selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testEbayAdvancedSearch() throws Exception {
		
		driver.navigate().to("http://www.google.com/");
        System.out.println(driver.getTitle());
        assertTrue(false);
      //  assertTrue( driver.getTitle().compareTo("xzx")==0 );

	}

	@After
	public void tearDown() throws Exception {
		
		if(driver!=null)
		{
			driver.close();
		}
	}
}
