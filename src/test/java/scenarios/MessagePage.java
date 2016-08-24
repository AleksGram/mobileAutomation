package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Грам on 24.08.2016.
 */
public class MessagePage extends Page {
    By messageButton = By.id(app_package_name+"profile_view_top_card_primary_button");
    By inputMessageField = By.id(app_package_name+"message_input");
    By sendMessageButton = By.id(app_package_name+"message_send");
    By message = new By.ByName("auto test");

    public void clickMessageButton(){
        waitForVisibilityOf(messageButton);
        driver.findElement(messageButton).click();
    }

    public void typeMessage(String message){
        driver.findElement(inputMessageField).sendKeys(message);
    }

    public void sendMessage(){
        driver.findElement(sendMessageButton).click();
        waitForVisibilityOf(message);
    }

    public WebElement getMessage() {
        return driver.findElement(message);
    }
}
