package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DialogContent extends _Parent {


    public DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div.header_user_info>a")
    public WebElement sign_in;


    @FindBy(id = "email")
    public WebElement e_mail;


    @FindBy(id = "passwd")
    public WebElement password;


    @FindBy(id = "SubmitLogin")
    public WebElement enter;


    @FindBy(xpath = "//a[@title='Contact us']")
    public WebElement contact;


    @FindBy(id = "id_contact")
    public WebElement subjectHeading;


    @FindBy(xpath = "//p[@id='desc_contact2']")
    public WebElement customerSelectMessage;


    @FindBy(id = "submitMessage")
    public WebElement sendButton;


    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement alertError;


    @FindBy(id = "message")
    public WebElement textArea;


    @FindBy(css = "p.alert.alert-success")
    public WebElement alertSuccess;


    @FindBy(xpath = "//a[@title='Specials']")
    public WebElement specials;


    @FindBy(id = "selectProductSort")
    public WebElement selectProdukt;


    @FindAll({@FindBy(css = "div.product-container")})

    public List<WebElement> productsNumber;


    @FindBy(xpath = "(//span[@itemprop='price'])[2]")
    public WebElement lowerprice1;

    @FindBy(xpath = "(//span[@itemprop='price'])[4]")
    public WebElement lowerprice2;


    @FindBy(xpath = "(//h5[@itemprop='name']/a)[1]")
    public WebElement productname1;
    @FindBy(xpath = "(//h5[@itemprop='name']/a)[2]")
    public WebElement productname2;


    @FindBy(xpath = "(//a[@title='Add to cart'])[1]")
    public WebElement addToCard1;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "(//link[@itemprop='availability'])[1]")
    public WebElement orderproduct1;


    @FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
    public WebElement proceedToCheckout2;

    @FindBy(name = "processAddress")
    public WebElement proceedToCheckout3;

    @FindBy(xpath = "//label[text()='I agree to the terms of service and will adhere to them unconditionally.']")
    public WebElement checkbox;

    @FindBy(name = "processCarrier")
    public WebElement proceedToCheckout4;


    @FindBy(xpath = "//a[@title='Pay by check.']")
    public WebElement paybycheck;


    @FindBy(css = "button.button.btn.btn-default.button-medium")
    public WebElement comfirmButton;


    @FindBy(xpath = "//a[@title='My orders']")
    public WebElement myOrders;


    @FindBy(id = "total_price")
    public WebElement productpriceship;

    @FindAll({@FindBy(css = "td.history_price")})
    public List<WebElement> orderpricelist;


    @FindAll({@FindBy(css = "a.color-myaccount")})
    public List<WebElement> orderedproductnamelist;

    @FindBy(xpath = "(//label[starts-with(@for,'cb')])[2]")
    public WebElement ordredpruductname;


    @FindBy(name = "msgText")
    public WebElement addamesage;


    @FindBy(css = "button[name='submitMessage']")
    public WebElement submitMessage;

}
