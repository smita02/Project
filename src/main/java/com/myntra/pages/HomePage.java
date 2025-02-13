package com.myntra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.base.Keyword;
import com.myntra.base.WaitFor;

public class HomePage {
	Keyword keyword = new Keyword();
	By menMenu = By.xpath("//a[@href=\"/shop/men\"]");
	By womenMenu = By.xpath("");
	By tShirtMenu = By.xpath("//a[@href=\"/men-tshirts\"]");
	@FindBy(xpath = "//button[@idid=\"iz-optin-wp-btn2Txt\"]")
	WebElement SubscribePopup;
	// By searchbarString=By.xpath("//input[@class=\"desktop-searchBar\"]");

	// @FindBy(xpath="//input[@class=\"desktop-searchBar\"]")
	// @FindBy(xpath = "//h4[@class=\"product-product\"]")
	@FindBy(xpath = "//input[@class=\"desktop-searchBar\"]")
	WebElement searchBarItemsElement;
	
	public void hoverOnMenMenu() {
		keyword.mouseHoverOn(Keyword.driver.findElement(menMenu));
	}

	public HomePage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public void clickOnTShirtsMenu() {
		WaitFor.elementToBeClickable(Keyword.driver.findElement(tShirtMenu));
		keyword.ClickOn(Keyword.driver.findElement(tShirtMenu));
		System.out.println("Clicked on T-Shirts Menu");
	}
	 // Constructor to initialize the PageFactory
//    public LoginPage(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }

    // Method to send a string (username) to the username input field
//    public void enterUsername(String username) {
//        usernameField.sendKeys(username);
//    }
	public void handleSubscribePopup() {
		SubscribePopup.click();
	}
	public void searchBoxItems(String SearchBoxText) throws InterruptedException {

		//searchBarItemsElement= keyword.ClickOn(Keyword.driver.findElement((By) searchBarItemsElement));
		searchBarItemsElement.sendKeys("Shoes");
		Thread.sleep(2000);
		handleSubscribePopup();
		System.out.println("In search button");

	}

}
