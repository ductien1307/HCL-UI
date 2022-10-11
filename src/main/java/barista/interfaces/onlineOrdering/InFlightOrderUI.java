package barista.interfaces.onlineOrdering;

public class InFlightOrderUI {
    public static final String ACTION_BTN = "(//div[contains(@class,'OrderCard_orderButtons')]//span[contains(text(),'%s')])[1]";
    public static final String NAME_TAB = "//div[@role='tab']//span[contains(text(),'%s')]";
    public static final String ORDER_ID_TXT = "//input[@placeholder='Order ID']";

}
