import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		for (WebElement menuName : menus) {
			String mName = menuName.getText();
			System.err.println(mName);
			a.moveToElement(menuName).perform();
			Thread.sleep(2000);
			//DemoScreenShot.ScreenShot(driver, mName);
			List<WebElement> subMenues = driver.findElements(
					By.xpath("//span[contains(.,'" + mName + "')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			for (WebElement subMenuName : subMenues) {
				System.out.println(subMenuName.getText());
			}
			Thread.sleep(2000);
		}
	}

}
