import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		List<WebElement> menues = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		for (WebElement menu : menues) {
			String mName = menu.getText();
			System.err.println(mName);
			a.moveToElement(menu).perform();
			Thread.sleep(4000);
			System.out.println("1");
			List<WebElement> subMenu = driver.findElements(By.xpath(
					"//a[contains(.,'" + mName + "')]/parent::li/descendant::ul[@class='odd-even-bg']/li/div/ul/li"));
			System.out.println("2");
			System.out.println(subMenu.size());
			for (WebElement name : subMenu) {
				System.out.println("3");
				System.out.println(name.getText());
			}
			Thread.sleep(1000);
		}
	}

}
