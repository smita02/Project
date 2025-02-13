package com.myntra.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import com.myntra.base.Keyword;

import net.bytebuddy.asm.Advice.This;

public class TestBase {
	 Keyword keyword = new Keyword();
	@BeforeMethod
	public void Setup() throws Exception{
		keyword.OpenBrowser("Firefox");
		keyword.driver.get("https://www.myntra.com/");
		
	}
	@AfterClass
	public void tearDown() throws Exception {
		//keyword.CloseBroswer();
	}
	
}
