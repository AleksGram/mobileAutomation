package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import scenarios.pages.PagesOfApp;

import java.net.MalformedURLException;
import java.io.File;
import java.net.URL;


public class AndroidSetup {
    String email = "your email";
    String password = "your password";
    String searchUser = "searching user";
    String myName = "your full name";
    String message = "auto test";

    protected static PagesOfApp pages;
    public static AndroidDriver driver;

    protected void prepareAndroidForAppium() throws MalformedURLException {
        File appDir = new File("C:\\Users\\Грам\\IdeaProjects\\mobileAuto\\apps");
        File app = new File(appDir, "linkedin-4-0-52.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device","Android");


        capabilities.setCapability("deviceName","Android");


        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    protected void autorization(){
        pages.getSignInPage().clickSignInButton();
        pages.getLoginPage().typeEmail(email);
        pages.getLoginPage().typePassword(password);
        pages.getLoginPage().clickSignInBtn();
    }
}