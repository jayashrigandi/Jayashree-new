package selenium.practices;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverMethods27Mar {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Load a new web page in the current browser window.
		driver.get("https://www.google.com");

		driver.switchTo().newWindow(WindowType.TAB).get("https://www.amazon.in");
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.flipkart.com");

		/*
		 * Close the current window, quitting the browser if it's the last window
		 * currently open
		 */
		// driver.close();

		/*
		 * Find the first WebElement using the given method. This method is affected by
		 * the'implicit wait' times in force at the time of execution. The
		 * findElement(..) invocation will return a matching row, or try again
		 * repeatedly until the configured timeout is reached. findElement should not be
		 * used to look for non-present elements, use findElements(By) and assert zero
		 * length response instead
		 */
		// WebElement maleRadioBtn = driver.findElement(By.cssSelector("#radio1"));

		/*
		 * Find all elements within the current page using the given mechanism. This
		 * method is affected bythe 'implicit wait' times in force at the time of
		 * execution. When implicitly waiting, thismethod will return as soon as there
		 * are more than 0 items in the found collection, or willreturn an empty list if
		 * the timeout is reached.
		 */
		// List<WebElement> radioButton =
		// driver.findElements(By.cssSelector("input[id*='radio']"));

		// Get a string representing the current URL that the browser is looking at.
		System.out.println("Current page url = " + driver.getCurrentUrl());

		// Get the source of the last loaded page
		// System.out.println(driver.getPageSource());

		// Get the title of the current page.
		System.out.println("Page Title = " + driver.getTitle());

		/*
		 * Return an opaque handle to this window that uniquely identifies it within
		 * this driver instance.This can be used to switch to this window at a later
		 * date
		 */
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		System.out.println("#######################################################");

		/*
		 * Return a set of window handles which can be used to iterate over all open
		 * windows of thisWebDriver instance by passing them to
		 * switchTo().Options.window()
		 */
		Set<String> windowsHandles = driver.getWindowHandles();
		for (String handle : windowsHandles) {
			System.out.println(handle);
		}

		// Fullscreen the current window if it is not already fullscreen
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		driver.manage().window().maximize();

		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		
		// An abstraction allowing the driver to access the browser's history and to navigate to a givenURL
		driver.navigate().to("https://omayo.blogspot.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		//driver.switchTo().

		// Quits this driver, closing every associated window.
		driver.quit();

	}

}
