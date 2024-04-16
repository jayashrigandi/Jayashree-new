package selenium.practices;

		import java.time.Duration;

		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;

			public class HandleJavascriptAlertinSelenium {

			public static void main(String[] args) throws InterruptedException {

				WebDriverManager.chromedriver().setup();

				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

				driver.get("https://omayo.blogspot.com/");
				driver.findElement(By.cssSelector("#confirm")).click();

				Alert alert = driver.switchTo().alert();
				// alert.accept();
				System.out.println(alert.getText());
				Thread.sleep(3000);
				alert.dismiss();

				driver.findElement(By.cssSelector("textarea#ta1")).sendKeys("Text post display alert");
			
	}

}
