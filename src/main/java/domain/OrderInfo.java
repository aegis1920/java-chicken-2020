package domain;

public class OrderInfo {
    private final Menu menu;
    private final Count count;

    public OrderInfo(final Menu menu, final Count count) {
        this.menu = menu;
        this.count = count;
    }
}
