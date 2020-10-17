package StepDefinitions;

import Pages.DialogContent;
import Pages._Parent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class _04_OrderHistorySteps extends _Parent {
    public String price;
    public String producktname1;


    DialogContent dialogContent = new DialogContent();


    @And("^Click Add to Cart and click proceed checkout three times$")
    public void clickAddToCartAndClickProceedCheckoutThreeTimes() {

        waitUntilClickable(dialogContent.productname1);
        scrollToElemenet(dialogContent.productname1);
        producktname1 = dialogContent.productname1.getText();

        Actions builder = new Actions(driver);
        builder.moveToElement(dialogContent.productname1).perform();


        clickFunction(dialogContent.addToCard1);
        clickFunction(dialogContent.proceedToCheckout);
        price = dialogContent.productpriceship.getText();
        clickFunction(dialogContent.proceedToCheckout2);
        clickFunction(dialogContent.proceedToCheckout3);


    }

    @Then("^Click I agree  and click proceed checkout$")
    public void clickIAgreeAndClickProceedCheckout() {

        clickFunction(dialogContent.checkbox);
        clickFunction(dialogContent.proceedToCheckout4);


    }

    @When("^Click to pay and comfirm$")
    public void clickToPayAndComfirm() {

        waitUntilClickable(dialogContent.paybycheck);
        clickFunction(dialogContent.paybycheck);
        clickFunction(dialogContent.comfirmButton);

    }

    @And("^Clic My Orders check product price$")
    public void clicMyOrdersCheckProductPrice() {

        clickFunction(dialogContent.myOrders);
        Assert.assertTrue(price.contains(dialogContent.orderpricelist.get(1).getText()));


    }


    @Then("^Check ordered product name$")
    public void checkOrderedProductName() {

        clickFunction(dialogContent.orderedproductnamelist.get(1));
        waitUntilVisible(dialogContent.ordredpruductname);
        scrollToElemenet(dialogContent.ordredpruductname);
        Assert.assertTrue(dialogContent.ordredpruductname.getText().contains(producktname1));

    }

    @And("^Check add a mesage$")
    public void checkAddAMesage() {

        sendKeysFunction(dialogContent.addamesage, "please help us ");
        clickFunction(dialogContent.submitMessage);
        verifyElementContainsText(dialogContent.alertSuccess, "successfully ");

    }
}
