package com.pages;

import com.base.BaseClasee;
import com.util.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

    @FindBy(css = "#block_top_menu")
    private WebElement headerMenuSection;

    @FindBy(css ="a[title='Women']")
    private WebElement headerWomenElement;

    @FindBy(css = "a[title='Women'] + ul")
    private WebElement womenSubMenuInHeader;


    public  Home_Page(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getHeaderMenuSection() {
        return headerMenuSection;
    }

    public WebElement getHeaderWomenElement() {
        return headerWomenElement;
    }

    public WebElement getWomenSubMenuInHeader() {
        return womenSubMenuInHeader;
    }

    public void hoverOverWomenInHader() {
        Actions actions = new Actions(BaseClasee.driver);
        actions.moveToElement(getHeaderWomenElement()).build().perform();
        Common.waitSecond(1);
    }
    public String getWomenInHeaderColor(){
        return headerWomenElement.getCssValue("background");
    }







}
