package scenarios.Tests;

import scenarios.pages.PagesOfApp;
import scenarios.setUp.AndroidSetup;

/**
 * Created by Грам on 26.08.2016.
 */
public class BaseTest extends AndroidSetup {
    String email = "your email";
    String password = "your password";
    String searchUser = "searching user";
    String myName = "your full name";
    String message = "auto test";

    protected static PagesOfApp pages;

    protected void autorization(){
        pages.getSignInPage().clickSignInButton();
        pages.getLoginPage().typeEmail(email);
        pages.getLoginPage().typePassword(password);
        pages.getLoginPage().clickSignInBtn();
    }




    }

