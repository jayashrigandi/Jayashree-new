package selenium.practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPracticeLocator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
//to open google search engine url
driver.get("https://www.google.com/");
Thread.sleep(3000);
List<WebElement> target = driver.findElements(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
((WebElement) target).click();
System.out.println("Open Gmail");

	}

}
