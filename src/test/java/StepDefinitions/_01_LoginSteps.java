package StepDefinitions;

import Pages.DialogContent;
import Pages._Parent;
import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class _01_LoginSteps extends _Parent {

    WebDriver driver;

    @Given("^Navigate to automationpractice$")
    public void navigateToAutomationpractice() {
        driver= Driver.getDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @When("^Enter username and password and click Login button$")
    public void enter_username_and_password_and_click_Login_button() {

        DialogContent dialogContent = new DialogContent();

        clickFunction(dialogContent.sign_in);
        sendKeysFunction(dialogContent.e_mail,"omergoker0616@gmail.com");
        sendKeysFunction(dialogContent.password,"123qwe");
        clickFunction(dialogContent.enter);

    }





}