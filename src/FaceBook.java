import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		WebElement createNewAcc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		System.out.println(createNewAcc.isEnabled());
		if (createNewAcc.isEnabled())
			createNewAcc.click();
		Thread.sleep(2000);

		WebElement day = driver.findElement(By.id("day"));
		Select sDay = new Select(day);

		sDay.selectByVisibleText("9");

		WebElement month = driver.findElement(By.id("month"));
		Select sMonth = new Select(month);
		sMonth.selectByValue("9");
		List<WebElement> months = sMonth.getOptions();
		for (WebElement mon : months) {
			System.out.println(mon.getText());
		}

		/*
		 * WebElement male =
		 * driver.findElement(By.xpath("//label[text()='Male']")); if
		 * (male.isDisplayed()) male.click(); Thread.sleep(2000);
		 * System.out.println(male.isSelected());
		 * System.out.println(male.getCssValue("background-color"));
		 * System.out.println(male.getRect().getPoint()); Point loc =
		 * male.getLocation(); System.out.println("x :" + loc.getX() + "   y : "
		 * + loc.getY());
		 */
		/*
		 * WebElement email = driver.findElement(By.id("email"));
		 * email.sendKeys("alia"); WebElement password =
		 * driver.findElement(By.id("pass")); password.sendKeys("ranbir");
		 * WebElement logIn = driver.findElement(By.name("login"));
		 * logIn.click();
		 */

		/*
		 * driver.findElement(By.linkText("Forgotten password?")).click();
		 * System.out.println(driver.getTitle());
		 */
	}

}
