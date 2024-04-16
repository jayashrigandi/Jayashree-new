package selenium.practices;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownunderSelecthtmlTag {

	public static void main(String[] args) throws InterruptedException {

		// single select drop down
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		//driver.get("https://omayo.blogspot.com/");
		driver.get("https://www.wincalendar.com/India/Calendar");

		WebElement singleSelectDropdown = driver.findElement(By.className("h2select"));
		Select select = new Select(singleSelectDropdown);

		// All selected options belonging to this select tag
		List<WebElement> allSelectedOption = select.getAllSelectedOptions();

		for (WebElement option : allSelectedOption) {
		System.out.println(option.getText());
		}

		// The first selected option in this select tag (or the currently selected
		// option in anormal select)
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());

		// select.deselectByIndex(0);

		// All options belonging to this select tag
	/*	List<WebElement> allOptionsFromDropdown = select.getOptions();
		System.out.println(allOptionsFromDropdown.size());

		for (WebElement option : allOptionsFromDropdown) {
			System.out.println(option.getText());
		}
*/
		// Whether this select element support selecting multiple options at the same
		// time?
		// Thisis done by checking the value of the "multiple" attribute.
		System.out.println(select.isMultiple());

		/*select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByValue("def");
		Thread.sleep(2000);
		select.selectByVisibleText("doc 4");*/

	}


}
