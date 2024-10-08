package Test;

import PageObjects.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001 extends BaseClass {


    @Test
    public void validatingUserBrandonAdded(){
        //initializing homepage, we will call our action methods in sequence
        HomePage hp = new HomePage(driver);
        try {
            hp.clickAddButton();
            hp.setFirstName("Brandon");
            hp.setLastName("Chawane");
            hp.setUserName("BrandonChawane");
            hp.setPassword("Password");
            hp.clickCompanyButton();
            hp.selectSalesTeam("Admin");
            hp.setEmailAddress("brandon.chawane@gmail.com");
            hp.setPhoneNumber("0985674132");
            hp.clickSaveButton();
            boolean vldUser = hp.validateUserAdded();
            Assert.assertTrue(vldUser);
        }catch (Exception e){
            logger.info("Adding user test failed");
            Assert.fail();
        }
    }

    @Test
    public void validatingUserChawaneAdded(){
        //initializing homepage, we will call our action methods in sequence
        HomePage hp = new HomePage(driver);
        try {
            hp.clickAddButton();
            hp.setFirstName("Chawane");
            hp.setLastName("Brandon");
            hp.setUserName("BrandonChawane");
            hp.setPassword("Password");
            hp.clickCompanyBB();
            hp.selectSalesTeam("Customer");
            hp.setEmailAddress("brandon.chawane@gmail.com");
            hp.setPhoneNumber("0795132458");
            hp.clickSaveButton();
            boolean vldChawane = hp.validateChawaneAdded();
            Assert.assertTrue(vldChawane);
        }catch (Exception e){
            logger.info("Adding Chawane test failed");
            Assert.fail();
        }
    }

}

