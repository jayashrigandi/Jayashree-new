package selenium.practices;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverMethodsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
	//	driver.get(nullnullhttps://www.google.com/");
		
			System.out.println(driver.getCurrentUrl());
			driver.switchTo().newWindow(WindowType.WINDOW).get("https://omayo.blogspot.com/");

driver.close();
WebElement maleRadiobutton = driver.findElement(By.cssSelector("#radio1"));;

//WebElement maleRadiobutton=driver.findElement(By.cssSelector(""));

System.out.println("Current page URL = "+driver.getCurrentUrl());
//current page title
System.out.println("Page title = "+driver.getTitle());
maleRadiobutton.click();
String WindowHandle = driver.getWindowHandle();// 
System.out.println(WindowHandle);
Set<String> WindowHandles = driver.getWindowHandles();
for(String Handle:WindowHandles)
{
	System.out.println(Handle);
}		

driver.manage().window().maximize();
driver.manage().window().fullscreen();
driver.manage().window().minimize();

driver.manage().timeouts().getPageLoadTimeout();
//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
driver.manage().deleteAllCookies();
driver.navigate().to("https://www.amazon.in/");// Back, forward and refresh ... these activities are navigation
driver.navigate().back();
driver.navigate().refresh();
driver.navigate().forward();

driver.quit();



	}

}
