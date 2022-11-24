package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class D02_LoginStepDef {
    P02_Login login = new P02_Login();
    @Given("user go to login page")
    public void goLoginPage()
    {
        login.loginlink().click();
    }
    @When("user login with {string} {string} and {string}")
    public void userLoginWithAnd(String arg0, String email, String password) {
        login.enteremail().sendKeys(email);
        login.enterpassword().sendKeys(password);
    }
    @And("user press on login button")
    public void ClickLogin(){
        login.clicklogin().click();
    }
    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        Assertions.assertAll(
                () -> softAssert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/"),
                () -> softAssert.assertTrue(login.errormessage().isDisplayed())
        );

    }
    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert softAssert = new SoftAssert();
        Assertions.assertAll(
                () -> softAssert.assertTrue(login.errormessage().getText().contains("Login was unsuccessful.")),
                () -> softAssert.assertEquals(Color.fromString(login.errormessage().getCssValue("color")).asHex(),"#e4434b")
        );
    }


}
