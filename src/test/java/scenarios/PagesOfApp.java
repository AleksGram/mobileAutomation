package scenarios;

/**
 * Created by Грам on 23.08.2016.
 */
public class PagesOfApp {
public static LoginPage getLoginPage(){
    return new LoginPage();
}

public static SearchPage getSearchPage(){
    return new SearchPage();
}
public static SignInPage getSignInPage(){
    return new SignInPage();
}
    public static MessagePage getMessagePage(){
        return new MessagePage();
    }
}
