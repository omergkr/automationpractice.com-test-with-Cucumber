package Pages;

import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class _Parent  {

    public WebDriver driver;
    public WebDriverWait wait;

    public _Parent() {
        driver= Driver.getDriver();
        wait=new WebDriverWait(driver,10);
    }

    public void clickFunction(WebElement element){

        waitUntilClickable(element);
        scrollToElemenet(element);
        element.click();
    }

    public void sendKeysFunction(WebElement element, String value){

        waitUntilVisible(element);
        scrollToElemenet(element);
        element.clear();
        element.sendKeys(value);

    }

    public void waitUntilClickable(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element));

    }


    public void waitUntilVisible(WebElement element){

        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void scrollToElemenet(WebElement element){

        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", element);

    }



    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList){

        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }


    public void verifyElementContainsText(WebElement element, String text){

        wait.until(ExpectedConditions.textToBePresentInElement(element,text));
        System.out.println(element.getText());
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));

    }

}
