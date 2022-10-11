package barista.actions.onlineOrdering;

import barista.interfaces.onlineOrdering.InFlightOrderUI;
import core.AbstractPage;
import org.openqa.selenium.WebDriver;

public class InFlightOrderPO extends AbstractPage {

    WebDriver driver;

    public InFlightOrderPO(WebDriver driver) {
        this.driver = driver;
    }

    public void inputOrderID(String orderID) {
        sendKeyToElement(driver, InFlightOrderUI.ORDER_ID_TXT, orderID);
    }

    public void clickTab(String tabName) {
        clickToElement(driver, xpathDynamic(InFlightOrderUI.NAME_TAB, tabName));
    }

}
