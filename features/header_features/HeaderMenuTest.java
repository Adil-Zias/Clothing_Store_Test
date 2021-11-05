package com.features.header_features;

import com.base.BaseClasee;
import com.pages.Home_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderMenuTest extends BaseClasee {

    Home_Page home_page;


    @Test
    public void headerMenuAreDisplayed_Test(){
        home_page = new Home_Page(driver);
        Assert.assertTrue(home_page.getHeaderMenuSection().isDisplayed());
    }

    @Test
    public void balckBackgraoundWhenHoverOnHeaderMenu_Test() {
        home_page = new Home_Page(driver);
        home_page.hoverOverWomenInHader();
        Assert.assertTrue(home_page.getWomenInHeaderColor().contains("51"));
    }

    @Test
    public void womenSubMenuDisplayedWhenHover_Test() {
        home_page = new Home_Page(driver);
        home_page.hoverOverWomenInHader();
        Assert.assertTrue(home_page.getWomenSubMenuInHeader().isDisplayed());

    }
}
