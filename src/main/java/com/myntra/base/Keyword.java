package com.myntra.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Keyword {
	public static RemoteWebDriver driver;

	public void OpenBrowser(String browsername) {
		if (browsername == "Firefox") {
			driver = new FirefoxDriver();

		} else if (browsername == "Edge") {
			driver = new EdgeDriver();
		} else if (browsername == "Chrome") {
			driver = new ChromeDriver();
		} else {

			System.err.println("Invalid browser name");
		}

	}

	public  void CloseBroswer() {
		driver.quit();
	}
	public  void mouseHoverOn(WebElement element) {
		Actions mouse=new Actions(driver);
		mouse.moveToElement(element).perform();
	}

	public void ClickOn(WebElement element) {
		element.click();
	}

}
