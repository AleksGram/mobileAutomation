package scenarios;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AppiumTest extends AndroidSetup {


    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void loginTest() {

        pages.getSignInPage().clickSignInButton();
        pages.getLoginPage().typeEmail(email);
        pages.getLoginPage().typePassword(password);
        pages.getLoginPage().clickSignInBtn();
        pages.getLoginPage().clickProffile();
        Assert.assertTrue(pages.getLoginPage().getFullName().equals(myName));


    }

    @Test
    public void searchingUser(){
        autorization();
        pages.getSearchPage().typeSearchUserName(searchUser);
        pages.getSearchPage().findUser(searchUser);
        Assert.assertTrue(pages.getSearchPage().getFullName().equals(searchUser));
    }

    @Test
public void sendMessage() {
        autorization();
        pages.getSearchPage().typeSearchUserName(searchUser);
        pages.getSearchPage().findUser(searchUser);
        pages.getMessagePage().clickMessageButton();
        pages.getMessagePage().typeMessage(message);
        pages.getMessagePage().sendMessage();
        Assert.assertTrue(pages.getMessagePage().getMessage().isDisplayed());
    }


}
