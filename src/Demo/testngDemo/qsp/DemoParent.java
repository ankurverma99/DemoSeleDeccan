package Demo.testngDemo.qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DemoParent {
	WebDriver drive;

	@BeforeMethod
	public void beforeM() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.google.com/");
		Thread.sleep(2000);
		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterM() {
		drive.close();
	}
}
