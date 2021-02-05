package Demo.testngDemo.qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Demo extends DemoParent {

	@Test
	public void tc_1() throws InterruptedException {
		WebElement search = drive.findElement(By.xpath("//input[@aria-label='Search']"));
		search.sendKeys("java", Keys.ENTER);
		System.out.println("tc1");
	}

	
}
