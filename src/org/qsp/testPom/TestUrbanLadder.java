package org.qsp.testPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.UrbanLadder;

public class TestUrbanLadder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		UrbanLadder ul = new UrbanLadder(driver);
		Thread.sleep(2000);
		ul.closeClick();
		Thread.sleep(2000);
		ul.saleMouseHover(driver);
		ul.sofaClick();
		ul.viewProductClick();
	}

}
