
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);

		WebDriverWait ww = new WebDriverWait(driver, 10);
		ww.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				System.out.println(js.executeScript("return document.readyState").toString());
				boolean pgl = js.executeScript("return document.readyState").toString().equals("complete");
				return pgl;
			}
		});

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='addTaskButtonId']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='selectedItem']/div[contains(.,'- Select Customer -')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='searchItemList']/div[contains(.,'- New Customer -')]")).click();
	}

}
