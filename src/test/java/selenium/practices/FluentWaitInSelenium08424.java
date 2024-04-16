package selenium.practices;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class FluentWaitInSelenium08424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//How to use implicit wait here
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		WebElement element= driver.findElement(By.cssSelector("div#delayedText"));
		
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).
				withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(10))
				.ignoring(TimeoutException.class);
		
		WebElement tryItBtn = driver.findElement(By.xpath("//button[text()='Try it']"));

		tryItBtn.click();

		WebElement myBtn = driver.findElement(By.cssSelector("#myBtn"));

		System.out.println("Attribute value = " + myBtn.getAttribute("disabled"));

		fluentWait.until(ExpectedConditions.attributeToBe(myBtn, "disabled", "true"));
		System.out.println("My btn is = " + myBtn.isEnabled());

		WebElement timerBtn = driver.findElement(By.cssSelector("#timerButton"));

		fluentWait.until(ExpectedConditions.elementToBeClickable(timerBtn));

		System.out.println(timerBtn.isEnabled());

		fluentWait.until(ExpectedConditions.visibilityOf(element));

		System.out.println(element.isDisplayed());

		driver.navigate().refresh();

		fluentWait.until(ExpectedConditions.stalenessOf(myBtn));
		myBtn = driver.findElement(By.cssSelector("#myBtn"));

		System.out.println("My btn is = " + myBtn.isEnabled());


		
				
		}

}
