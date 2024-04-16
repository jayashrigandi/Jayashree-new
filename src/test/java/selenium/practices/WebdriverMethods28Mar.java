package selenium.practices;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverMethods28Mar {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();

//Load a new web page in the current browser window
//driver.get("https://www.google.com/");
//Method for to open new tabs on current web browser
//driver.switchTo().newWindow(WindowType.TAB).get("https://www.meesho.com/");

//driver.switchTo().newWindow(WindowType.TAB).get("https://www.flipkart.com/");
//Method for to show current page url
System.out.println("Current page url="+ driver.getCurrentUrl());
//Method for to show current page source
//System.out.println("Current page source="+ driver.getPageSource());
////Method for to show current page Title
System.out.println("Current Page Title is  "+driver.getTitle());
System.out.println("=======================================");
//Method to show unique window handle 
//String windowhandle = driver.getWindowHandle();
//System.out.println(windowhandle);
//Method to show unique set of window handles
Set<String> handles = driver.getWindowHandles();
System.out.println(handles);
//Methods to manage size of the window 
driver.manage().window().maximize();
driver.manage().window().fullscreen();
driver.manage().window().minimize();

driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20, 0));
System.out.println();
driver.manage().timeouts().getPageLoadTimeout();
driver.manage().deleteAllCookies();
//An abstraction allowing the driver to navigate browser's history and to navigate to the given url
driver.navigate().to("https://www.youtube.com/");
Thread.sleep(30000);
driver.navigate().back();



	}

}
