package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mar26Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//id & name locators
		
		//WebElement searchbox=driver.findElements("navbar");
		WebElement userNameTextField =driver.findElement(By.name("userid"));
		userNameTextField.sendKeys("Codemind");
		Thread.sleep(3000);
		//driver.wait(3000);//3sec not worked
		WebElement passwordTextField =driver.findElement(By.name("pswrd"));
		passwordTextField.sendKeys("Test143$");
		Thread.sleep(3000);
		WebElement femaleRadioBtn=driver.findElement(By.id("radio2"));
		femaleRadioBtn.click();
		
		//By Class
		WebElement title= driver.findElement(By.className("title"));
		@SuppressWarnings("unused")
		String titleText=title.getText();
		System.out.println("titleText");
	//	driver.wait(1000);
		//driver.close();
		
		
		//By linkText
		
		WebElement Pageone= driver.findElement(By.linkText("Page One"));
		Pageone.click();
		Thread.sleep(10000);//10sec
	}

}
