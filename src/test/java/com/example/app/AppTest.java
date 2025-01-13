package com.example.app;

import app.App_One;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {
	private App_One apptest;
	@BeforeMethod
	public void setup() {
		apptest = new App_One();
	}
	
    @Test
    public void testTitle1() {
    	String url  = "https://www.google.com";
    	apptest.openWeb(url);
    	String title = apptest.getPageTitle();
    	System.out.println("page title is " +title);

        Assert.assertTrue(title.contains("Google"), "Strings should match");
    }
    
    @Test
    public void testTitle2() {
    	String url  = "https://www.cricbuzz.com";
    	apptest.openWeb(url);
    	String title1 = apptest.getPageTitle();
    	System.out.println("page title is " +title1);
        Assert.assertTrue(title1.contains("Cricbuzz"), "Strings should match");
    	
    }
}
