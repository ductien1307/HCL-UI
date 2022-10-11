package barista.testCases.OnlineOrdering;

import barista.actions.onlineOrdering.InFlightOrderPO;
import barista.actions.DashBoardPO;
import core.AbstractTest;
import core.config.Menu;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class InFlightOrder extends AbstractTest {

    public InFlightOrderPO inFlightOrderPO;
    public DashBoardPO dashBoardPO;

    @BeforeClass()
    public void beforeClass() {
        inFlightOrderPO = new InFlightOrderPO(driver);
    }

    /*@Test(dataProvider = "data")
    public void inFlightOrderNew(int qty) throws InterruptedException {
        clickByText(driver, "Sala 2");
        sleep(3);
        clickByText(driver, Menu.ONLINE_ORDERING.getValue());
        //inFlightOrderPO.clickAction("Ready");
    }*/

    @Test(dataProvider = "data")
    public void inFlightOrderSearch(String orderID) throws InterruptedException {
        clickByText(driver, "Sala 2");
        sleep(3);
        clickByText(driver, Menu.ONLINE_ORDERING.getValue());
        sleep(3);
        inFlightOrderPO.clickTab(Menu.ALL.getValue());
        inFlightOrderPO.inputOrderID(orderID);

    }

    @DataProvider(name = "data")
    public Object[][] dataCart(Method method) {
        Object[][] result = null;
        if (method.getName().equals("inFlightOrderNew")) {
            result = new Object[][]{
                    {3},
            };
        } else if (method.getName().equals("inFlightOrderSearch")) {
            result = new Object[][]{
                    {"1383101022000000001"},
            };
        }
        return result;
    }
}
