package StepDefinitions;

import Pages.DialogContent;
import Pages._Parent;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class _02_ContactUsSteps extends _Parent {

    DialogContent dialogContent = new DialogContent();

    @Given("^Navigate to ContactUs$")
    public void navigateToContactUs() {



        clickFunction(dialogContent.contact);



    }

    @When("^Select to subject Heading and check the Message$")
    public void selectToSubjectHeadingAndCheckTheMessage() {

        Select select=new Select(dialogContent.subjectHeading);

        select.selectByIndex(1);
        verifyElementContainsText(dialogContent.customerSelectMessage,"For any question");


    }

    @Then("^Click to send and check the Message$")
    public void clickToSendAndCheckTheMessage() {

        clickFunction(dialogContent.sendButton);
        verifyElementContainsText(dialogContent.alertError,"error");

    }

    @And("^Write the Message as \"([^\"]*)\" and send and check the Message$")
    public void writeTheMessageAsAndSendAndCheckTheMessage(String text) {

        sendKeysFunction(dialogContent.textArea, text);
        clickFunction(dialogContent.sendButton);

        verifyElementContainsText(dialogContent.alertSuccess, "successfully");

    }


}
