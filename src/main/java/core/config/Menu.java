package core.config;

public enum Menu {
    ONLINE_ORDERING,
    CAMPAIGNS,
    REPORT,
    SETTING,
    E_CODES,
    NEW,
    AT_BARISTA,
    ORDER_READY,
    ALL;
    public String getValue() {
        switch (this) {
            case ONLINE_ORDERING:
                return "Online Ordering";
            case CAMPAIGNS:
                return "Campaigns";
            case REPORT:
                return "Report";
            case SETTING:
                return "Setting";
            case E_CODES:
                return "Ecodes";
            case NEW:
                return "New";
            case AT_BARISTA:
                return "At Barista";
            case ORDER_READY:
                return "Order ready";
            case ALL:
                return "All";
            default:
                return null;
        }
    }
}
