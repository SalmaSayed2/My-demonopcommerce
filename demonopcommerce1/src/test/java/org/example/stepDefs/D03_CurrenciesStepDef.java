package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homepage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class D03_CurrenciesStepDef {

    P03_homepage homepage = new P03_homepage();

    @Given("user changed currency to {string}")
    public void userChangedCurrencyTo(String currency) {
        Select dropDown = new Select(homepage.currencydropDown);
        switch(currency){
            case "Euro" :
                dropDown.selectByIndex(1);
                break;
            case "US Dollar" :
                dropDown.selectByIndex(0);
                break;
        }
    }

    @Then("homepage products are changed to {string}")
    public void homepageProductsAreChangedTo(String currency) {
        for(int i = 0 ; i < homepage.productsprices.size(); i++)
        {
            String price = homepage.productsprices.get(i).getText();
            switch(currency){
                case "Euro" :
                    Assert.assertTrue(price.contains("€"));
                    break;
                case "US Dollar" :
                    Assert.assertTrue(price.contains("$"));
                    break;
            }
        }
    }
}