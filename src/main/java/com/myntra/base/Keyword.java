package com.myntra.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Keyword {
	public static RemoteWebDriver driver;

	public void OpenBrowser(String browsername) {
		if (browsername.equalsIgnoreCase("Chrome")) {
			driver = new FirefoxDriver();

		} else if (browsername == "Edge") {
			driver = new EdgeDriver();
		} else if (browsername == "Firefox") {
			driver = new ChromeDriver();
		} else {

			System.err.println("Invalid browser name");
		}

	}

	public void CloseBroswer() {
		driver.quit();
	}

	public void mouseHoverOn(WebElement element) {
		Actions mouse = new Actions(driver);
		mouse.moveToElement(element).perform();
	}

	public WebElement ClickOn(WebElement element) {
		element.click();
		return element;
	}

}
