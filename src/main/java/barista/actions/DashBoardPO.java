package barista.actions;

import barista.interfaces.DashBoardUI;
import org.openqa.selenium.WebDriver;
import core.AbstractPage;

public class DashBoardPO extends AbstractPage {

    WebDriver driver;

    public DashBoardPO(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMenu(String menu) {
        clickToElement(driver, xpathDynamic(DashBoardUI.MENU_LBL, menu));
    }



}
