package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D1_registerStepDef {
    P01_register register = new P01_register();
    @Given
            ("user go to register page")
    public void goRegisterPage()
    {
        register.registerlink().click();
    }
    @When
            ("user select gender type")
    public void SelectGender()
    {
        register.selectgender().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String firstName, String lastName) {
        register.enterfirstname().sendKeys(firstName);
        register.enterlastname().sendKeys(lastName);
    }
    @And("user enter date of birth")
    public void EnterDateOfBirth() {
        Select dropDown = new Select(register.enterbirthday());
        dropDown.selectByValue("29");

        dropDown = new Select(register.enterbirthmonth());
        dropDown.selectByValue("10");

        dropDown = new Select(register.enterbirthyear());
        dropDown.selectByValue("1992");

    }
    @And("user enter email {string} field")
    public void EnterEmail(String email) {
        register.enteremail().sendKeys(email);
    }
    @And("user fills Password fields {string} {string}")
    public void EnterPassword(String password, String confirmPassword) {
        register.enterepassword().sendKeys(password);
        register.confirmpassword().sendKeys(confirmPassword);
    }
    @And("user clicks on register button")
    public void ClicksOnRegister() {
        register.clickregister().click();
    }
    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(register.asserttheresult().getText(),"Your registration completed");
        softAssert.assertEquals(register.asserttheresult().getCssValue("color"),"rgba(76, 177, 124, 1)");
    }
}


