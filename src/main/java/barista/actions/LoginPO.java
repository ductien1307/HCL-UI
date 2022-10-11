package barista.actions;

import barista.interfaces.LoginUI;
import org.openqa.selenium.WebDriver;
import core.AbstractPage;
import core.config.Domains;

public class LoginPO extends AbstractPage {

    WebDriver driver;

    public LoginPO(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoLoginPage() {
        openAnyUrl(driver, Domains.HOME + "login");
    }

    public void clickLoginWithOffice_365() {
        clickToElement(driver, LoginUI.LOGIN_OFFICE_365);
    }

    public void clickNextButton() {
        clickToElement(driver, LoginUI.NEXT_BTN);
    }

    public void clickYesButton() {
        clickToElement(driver, LoginUI.YES_BTN);
    }

    public void inputUserName(String userName) {
        sendKeyToElement(driver, LoginUI.EMAIL_TXT, userName);
    }

    public void inputPassWord(String userPass) {
        sendKeyToElement(driver, LoginUI.PASSWORD_TXT, userPass);
    }

    public void clickLogin() {
        clickToElement(driver, LoginUI.SIGN_IN_BTN);
    }

}
