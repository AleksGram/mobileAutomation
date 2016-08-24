package scenarios;

import org.openqa.selenium.By;

/**
 * Created by Грам on 24.08.2016.
 */
public class SignInPage extends  Page {
    By signInButton = By.id(app_package_name+"growth_prereg_fragment_sign_in_button");

    public void clickSignInButton(){
        waitForVisibilityOf(signInButton);
        driver.findElement(signInButton).click();
    }
}
