package selenium.practices;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

//import utility.ReadProperty;

public class HardAssertionTestNG {
 WebDriver driver;
 /*Precondition before starting actual test execution*/
		@BeforeMethod
		public void setup() {
			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

			//driver.get(ReadProperty.readProperty("https://omayo.blogspot.com/"));
			driver.get("https://omayo.blogspot.com/");
		}

		@Test
		public void verufyHomePageurl() {
			String url = driver.getCurrentUrl();
			String expectedUrl = "https://omayo.blogspot.co/";
			Assert.assertEquals(url, expectedUrl);
			
		}		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

	}

