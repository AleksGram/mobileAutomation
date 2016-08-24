package scenarios.pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

/**
 * Created by Грам on 23.08.2016.
 */
public class LoginPage extends Page {
    String app_package_name = "com.linkedin.android:id/";
    By userEmail = By.id(app_package_name + "growth_login_join_fragment_email_address");
    By userPassword = By.id(app_package_name + "growth_login_join_fragment_password");
    By signInBtn= By.id(app_package_name+"growth_login_fragment_sign_in");
    By items = new MobileBy.ByAccessibilityId("Me");
    By fullName = By.id(app_package_name+"profile_view_top_card_full_name");


    public void typeEmail(String email){
    driver.findElement(userEmail).sendKeys(email);
}

public void typePassword (String pass){
    driver.findElement(userPassword).sendKeys(pass);
}

public void clickSignInBtn(){
    driver.findElement(signInBtn).click();
}
public void clickProffile(){
    waitForVisibilityOf(items);
   driver.findElement(items).click();
    waitForVisibilityOf(fullName);
}

    public String getFullName() {
        String name;
        name = driver.findElement(fullName).getText();
        return name;
    }
}
