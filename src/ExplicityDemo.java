
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Ankur/images/WebDriverWait%20Examples/DisabledText.html");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.name("textA")).sendKeys("name");
		WebDriverWait ww = new WebDriverWait(driver, 10);
		driver.findElement(By.id("abc")).sendKeys("name");
		ww.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver arg0) {
				return !driver.findElement(By.id("xyz")).isEnabled();
			}
		});
		driver.findElement(By.id("pqr")).sendKeys("ANkur");
	}

}
