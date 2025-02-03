package com.myntra.pages;
import org.openqa.selenium.By;
import com.myntra.base.Keyword;
import com.myntra.base.WaitFor;


public class HomePage {
	Keyword keyword = new Keyword();
	By menMenu = By.xpath("//a[@href=\"/shop/men\"]");
	By womenMenu = By.xpath("");
	By tShirtMenu = By.xpath("//a[@href=\"/men-tshirts\"]");
	
	public void hoverOnMenMenu() {
		keyword.mouseHoverOn(Keyword.driver.findElement(menMenu));
	}
	
	public void clickOnTShirtsMenu() {
		WaitFor.elementToBeClickable(keyword.driver.findElement(tShirtMenu));
		keyword.ClickOn(keyword.driver.findElement(tShirtMenu));
		System.out.println("Clicked on T-Shirts Menu");
	}
	
}
