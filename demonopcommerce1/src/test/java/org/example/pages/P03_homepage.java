package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P03_homepage {

    public P03_homepage() { PageFactory.initElements(driver,this); }

    @FindBy(id = "customerCurrency")
    public WebElement currencydropDown;

    @FindAll(@FindBy(css = "span[class=\"price actual-price\"]"))
    public List<WebElement> productsprices;

    @FindBy(id = "small-searchterms")
    public WebElement searchbar;

    @FindBy(css = "button[class=\"button-1 search-box-button\"]")
    public WebElement searchbutton;

    @FindAll(@FindBy(className = "product-title"))
    public List<WebElement> products;

    @FindBys({
            @FindBy(css = "div[class = \"sku\"]"),
            @FindBy(css = "span[class = \"value\"]")
    })
    public WebElement productSKU;

    @FindBys({
            @FindBy(css = "ul[class=\"top-menu notmobile\"]"),
            @FindBy(tagName = "li"),
            @FindBy(tagName = "a")
    })
    public List<WebElement> categories;

    @FindBys({
            @FindBy(css = "ul[class=\"sublist first-level\"]"),
            @FindBy(tagName = "li"),
            @FindBy(tagName = "a")
    })
    public List<WebElement> subCategories;

    @FindBys({
            @FindBy(className = "page-title"),
            @FindBy(tagName = "h1")
    })
    public WebElement pageTitle;

    @FindBys({
            @FindBy(id = "nivo-slider"),
            @FindBy(tagName = "a")
    })
    public List<WebElement> sliders;

    @FindBys({
            @FindBy(className = "facebook"),
            @FindBy(tagName = "a")
    })
    public WebElement clickfacebookButton;

    @FindBys({
            @FindBy(className = "twitter"),
            @FindBy(tagName = "a")
    })
    public WebElement clicktwitterButton;

    @FindBys({
            @FindBy(className = "rss"),
            @FindBy(tagName = "a")
    })
    public WebElement rssButton;

    @FindBys({
            @FindBy(className = "youtube"),
            @FindBy(tagName = "a")
    })
    public WebElement clickyoutubeButton;

    @FindBys({
            @FindBy(className = "product-title"),
            @FindBy(tagName = "a")
    })
    public List<WebElement> productname;

    @FindBy(css = "button[class=\"button-2 add-to-wishlist-button\"]")
    public List<WebElement> wishlistButtons;

    @FindBy(className = "content")
    public WebElement wishlistSuccessMessageText;

    @FindBy(css = "div[class=\"bar-notification success\"]")
    public WebElement wishlistSuccessMessageBackgorund;

    @FindBy(className = "ico-wishlist")
    public WebElement wishlistLink;

    @FindBy(className = "qty-input")
    public WebElement itemQuantity;}