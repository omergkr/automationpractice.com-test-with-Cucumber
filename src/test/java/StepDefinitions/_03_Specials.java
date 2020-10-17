package StepDefinitions;

import Pages.DialogContent;
import Pages._Parent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Random;

public class _03_Specials extends _Parent {

    DialogContent dialogContent = new DialogContent();

    @Given("^Navigate to Specials$")
    public void navigateToSpecials() {
        clickFunction(dialogContent.specials);
    }

    @When("^Check the number of  products$")
    public void checkTheNumberOfProducts() {

        Assert.assertTrue(dialogContent.productsNumber.size() == 2);


    }

    @Then("^Check lowest price$")
    public void checkLowestPrice() {

        Select select = new Select(dialogContent.selectProdukt);
        Random random = new Random();
        int rndnumber = random.nextInt(2) + 1;


        select.selectByIndex(rndnumber);

        String product1str = dialogContent.lowerprice1.getText().trim().replaceAll("[^0-9.]", "");
        double product1 = Double.parseDouble(product1str);
        String product2str = dialogContent.lowerprice2.getText().trim().replaceAll("[^0-9.]", "");
        double product2 = Double.parseDouble(product2str);

        if (rndnumber == 1)
            Assert.assertTrue(product1 < product2);
        else
            Assert.assertTrue(product1 > product2);

    }

    @And("^Check Product Name A to Z$")
    public void checkProductNameAToZ() {

        Select select = new Select(dialogContent.selectProdukt);
        Random random = new Random();
        int rndnumber = random.nextInt(2) + 3;
        System.out.println(rndnumber);

        select.selectByIndex(rndnumber);

        String dizi1[] = dialogContent.productname1.getText().trim().split("");
        String dizi2[] = dialogContent.productname2.getText().trim().split("");

        int sayac = 0;
        if (dizi1.length > dizi2.length)
            sayac = dizi2.length;
        else
            sayac = dizi1.length;

        for (int i = 0; i < sayac; i++) {

            if (!dizi1[i].equals(dizi2[i])) {
                char harf1 = dizi1[i].charAt(0);
                char harf2 = dizi2[i].charAt(0);

                if (rndnumber == 3)
                    Assert.assertTrue(harf1 < harf2);
                else
                    Assert.assertTrue(harf1 > harf2);
                break;
            }

        }


    }
}
