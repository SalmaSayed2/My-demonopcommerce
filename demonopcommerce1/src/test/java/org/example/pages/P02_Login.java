package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {

  public WebElement loginlink() {
      return Hooks.driver.findElement(By.className("ico-login"));}
    public WebElement enteremail() {
        return Hooks.driver.findElement(By.id("Email"));}
    public WebElement enterpassword() {
        return Hooks.driver.findElement(By.id("Password"));}
    public WebElement clicklogin() {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));}
    public WebElement errormessage() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\\\"message-error validation-summary-errors\\\"]\""));}
    public WebElement myaccountlink() {
        return Hooks.driver.findElement(By.className("ico-account"));}




    }


