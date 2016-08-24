package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Грам on 23.08.2016.
 */
public abstract  class Page {
    String app_package_name = "com.linkedin.android:id/";

    protected void waitForVisibilityOf(By locator) {

        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

   public WebDriver driver = AndroidSetup.driver;
    public Page(){
        PageFactory.initElements(driver, this);
    }


}
