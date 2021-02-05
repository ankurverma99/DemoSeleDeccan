import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Ankur/html/multi.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("a"));
		Select s = new Select(ele);
		// s.selectByValue("125");
		// s.selectByVisibleText("126");
		s.selectByIndex(2);

		WebElement ele2 = driver.findElement(By.id("b"));
		Select s1 = new Select(ele2);
		if (s1.isMultiple()) {
			/*
			 * s1.selectByValue("322"); s1.selectByValue("324");
			 */
			List<WebElement> vals = s1.getOptions();
			for (WebElement val : vals) {
				s1.selectByValue(val.getText());
				Thread.sleep(1000);
			}
		}
		/*
		 * s1.deselectByIndex(2); Thread.sleep(1000); s1.deselectByValue("324");
		 * Thread.sleep(1000); s1.deselectByVisibleText("321");
		 */
		System.out.println(s1.getFirstSelectedOption().getText());
		List<WebElement> sopt = s1.getAllSelectedOptions();
		for (WebElement opt : sopt) {
			System.out.println(opt.getText());
		}
		s1.deselectAll();

	}

}
