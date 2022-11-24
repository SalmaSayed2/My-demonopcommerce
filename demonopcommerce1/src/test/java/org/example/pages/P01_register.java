package org.example.pages;
import org.example.stepDefs.Hooks;
    import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
    public class P01_register {
        public WebElement registerlink() {
            return Hooks.driver.findElement(By.className("ico-register"));
            //return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-signUp\"]"));

        }
        public WebElement selectgender() {
            return Hooks.driver.findElement(By.id("gender-female"));
        }
        public WebElement enterfirstname() {
            return(Hooks.driver.findElement(By.id("FirstName")));

        }
       public WebElement enterlastname(){
           return(Hooks.driver.findElement(By.id("LastName")));
}
        public WebElement enterbirthday(){
             return Hooks.driver.findElement(By.name("DateOfBirthDay"));
}
        public WebElement enterbirthmonth(){
            return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        }
        public WebElement enterbirthyear(){
            return Hooks.driver.findElement(By.name("DateOfBirthYear"));}
        public WebElement enteremail(){
            return(Hooks.driver.findElement(By.id("Email")));}
        public WebElement enterepassword(){
            return(Hooks.driver.findElement(By.id("password")));}
        public WebElement confirmpassword(){
            return(Hooks.driver.findElement(By.id("ConfirmPassword")));}
        public WebElement clickregister(){
            return(Hooks.driver.findElement(By.id("register-button")));}
        public WebElement asserttheresult(){
            return(Hooks.driver.findElement(By.className("result")));}

    }
