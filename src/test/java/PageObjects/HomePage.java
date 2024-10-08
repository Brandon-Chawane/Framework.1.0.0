package PageObjects;

import Utils.WebActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //instance of WebActions class
    WebActions wa = new WebActions(driver);

    //Elements
    @FindBy(xpath = "//button[normalize-space()='Add User']")
    private WebElement btnBddUser;
    @FindBy(xpath = "//input[@name='FirstName']")
    private WebElement txtFirstName;
    @FindBy(xpath = "//input[@name='LastName']")
    private WebElement txtLastName;
    @FindBy(xpath = "//input[@name='UserName']")
    private WebElement txtUserName;
    @FindBy(xpath = "//input[@name='Password']")
    private WebElement txtPassword;
    @FindBy(xpath = "//input[@value='15']")
    private WebElement btnCompanyAAA;

    @FindBy(xpath = "//input[@value='16']")

    private WebElement btnCompanyBBB;
    @FindBy(xpath = "//select[@name='RoleId']")
    private WebElement ddSalesTeamCustomerAdmin;
    @FindBy(xpath = "//input[@name='Email']")
    private WebElement txtEmail;
    @FindBy(xpath = "//input[@name='Mobilephone']")
    private WebElement txtPhone;
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement save;
    @FindBy(xpath = "//td[normalize-space()='Brandon']")
    private WebElement validBrandon;

    @FindBy(xpath = "//td[normalize-space()='Chawane']")
    private WebElement validChawane;


    //Action Methods - in sequence with your elements
    public void clickAddButton() {
        wa.click(btnBddUser);
    }

    public void setFirstName(String firstName) {
        wa.enterValue(txtFirstName, firstName);
    }

    public void setLastName(String lastName) {
        wa.enterValue(txtLastName, lastName);
    }

    public void setUserName(String userName) {
        wa.enterValue(txtUserName, userName);
    }

    public void setPassword(String password) {
        wa.enterValue(txtPassword, password);
    }

    public void clickCompanyButton() {
        wa.click(btnCompanyAAA);
    }

    public void selectSalesTeam(String admin) {
        wa.dropDownMenuSelect(ddSalesTeamCustomerAdmin, admin);
    }

    public void setEmailAddress(String emailAddress) {
        wa.enterValue(txtEmail, emailAddress);
    }

    public void setPhoneNumber(String phoneNumber) {
        wa.enterValue(txtPhone, phoneNumber);
    }

    public void clickCompanyBB(){
        wa.click(btnCompanyBBB);
    }

    public void clickSaveButton() {
        wa.click(save);
    }

    //validation
    public boolean validateUserAdded() {
        try {
            return validBrandon.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean validateChawaneAdded() {
        try {
            return validChawane.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
