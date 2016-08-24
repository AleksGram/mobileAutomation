package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Грам on 24.08.2016.
 */
public class SearchPage extends Page {

    By searchField = By.id(app_package_name + "search_bar_text");
    By listOfUsers = By.id(app_package_name + "typeahead_item_view");
    By userFromList = By.id(app_package_name + "type_ahead_large_view_first_text");
    By noUserFind = By.id(app_package_name + "type_ahead_small_view_name");
    By fullName = By.id(app_package_name+"profile_view_top_card_full_name");




    public void typeSearchUserName(String userName) {
        waitForVisibilityOf(searchField);
        driver.findElement(searchField).sendKeys(userName);

    }

    public void findUser(String userName) {
        waitForVisibilityOf(userFromList);
        if (driver.findElement(userFromList).getText().contains(userName)) {
            List<WebElement> searchResult = driver.findElements(listOfUsers);
            searchResult.get(0).click();
        } else {
            if (driver.findElement(noUserFind).isDisplayed())
                System.out.println("Couldn't find the user");

        }
    }

    public String getFullName() {
        String name;
        waitForVisibilityOf(fullName);
        name = driver.findElement(fullName).getText();
        return name;
    }
}