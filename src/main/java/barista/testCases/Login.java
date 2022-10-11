package barista.testCases;

import barista.actions.DashBoardPO;
import barista.actions.LoginPO;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import core.AbstractTest;

import java.lang.reflect.Method;

public class Login extends AbstractTest {

    public LoginPO loginPO;
    public DashBoardPO dashBoardPO;

    @BeforeClass()
    public void beforeClass() {
        loginPO = new LoginPO(driver);
        dashBoardPO = new DashBoardPO(driver);
    }

    @Test(dataProvider = "data")
    public void validAccount(String userName, String passWord, String expect) throws InterruptedException {
        loginPO.gotoLoginPage();
        loginPO.clickLoginWithOffice_365();
        loginPO.inputUserName(userName);
        loginPO.clickNextButton();
        loginPO.inputPassWord(passWord);
        loginPO.clickLogin();
        //loginPO.clickYesButton();
        //sleep(5);
        //String titlePage = getTitlePage(driver);
        //verifyContains(titlePage, expect);
    }

    @DataProvider(name = "data")
    public Object[][] dataSignIn(Method method) {
        Object[][] result = null;
        if (method.getName().equals("validAccount")) {
            result = new Object[][]{
                    {"qa.accounttesting@vtijs.com", "Dss###2022", "Highlands Barista System | Barista"},
            };
        }
        return result;
    }
}
