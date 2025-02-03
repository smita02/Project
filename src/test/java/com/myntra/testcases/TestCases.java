package com.myntra.testcases;

import org.testng.annotations.Test;

import com.myntra.pages.HomePage;
import com.myntra.pages.ResultPage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.myntra.base.Keyword;
import com.myntra.base.TestBase;
import com.myntra.base.WaitFor;
import com.myntra.locators.Locator;
import com.myntra.pages.HomePage;
import com.myntra.pages.ResultPage;
import com.myntra.pages.SearchResultPage;
import com.myntra.utils.OR;

public class TestCases extends TestBase{

	@Test
	public void verifyDescriptionOfSearchResultForTShirtsUsingPom() {
		HomePage homepage = new HomePage();
		homepage.hoverOnMenMenu();
		homepage.clickOnTShirtsMenu();
		ResultPage resultPage = new ResultPage();
		resultPage.clickOnCategory("Tshirts");
		resultPage.verifyAllProductDescriptionsContains("T-Shirts");
	}
}


