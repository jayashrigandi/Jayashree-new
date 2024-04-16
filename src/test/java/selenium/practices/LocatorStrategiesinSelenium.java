package selenium.practices;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorStrategiesinSelenium {
	
	
			public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://omayo.blogspot.com/");
			driver.manage().window().maximize();

			// By.name
			WebElement userNameTextField = driver.findElement(By.name("userid"));
			userNameTextField.sendKeys("Codemind");

			WebElement gender = driver.findElement(By.name("gender"));
			gender.click();

			Thread.sleep(3000);

			// By.id
			WebElement femaleRadioBtn = driver.findElement(By.id("radio2"));
			femaleRadioBtn.click();

			// By.className
			WebElement title = driver.findElement(By.className("title"));
			String titleText = title.getText();
			System.out.println(titleText);

			// By.linkText
			WebElement openPopupLink = driver.findElement(By.linkText("Open a popup window"));
			openPopupLink.click();

			// By.partialLinkText
			WebElement seleniumTutorial = driver.findElement(By.partialLinkText("umTutorial"));
			seleniumTutorial.click();

			// By.tagName
			List<WebElement> links = driver.findElements(By.tagName("a"));

			System.out.println("Number of links prasent on home page is = " + links.size());

			for (WebElement link : links) {
				System.out.println(link.getAttribute("href"));
			}

			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

			List<WebElement> buttons = driver.findElements(By.tagName("button"));
			Iterator<WebElement> it = buttons.iterator();

			while (it.hasNext()) {
				System.out.println(it.next().getText());
			}

			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

			List<WebElement> elements = driver.findElements(By.id("codemind"));
			System.out.println("WebElement list size = " + elements.size());

			// WebElement elm=driver.findElement(By.id("codemind"));

			System.out.println("After exception");

		}

	}

	


	
