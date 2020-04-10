package domain;

import java.util.ArrayList;

public class Table {
    private final int number;
    private OrderInfos orderInfos;

    public Table(final int number) {
        this.number = number;
        this.orderInfos = new OrderInfos(new ArrayList<>());
    }

    public void addMenu(int menuNumber, int count) {
        orderInfos.add(new OrderInfo(MenuRepository.getMenu(menuNumber), new Count(count)));
    }

    public boolean isRightTable(final int number) {
        return this.number == number;
    }

    public Count countChicken() {
        return orderInfos.countChicken();
    }

    public void clean() {
        orderInfos.clean();
    }

    public boolean isOrder() {
        return orderInfos.isOrder();
    }

    public long calculateTotal() {
        return orderInfos.calculate();
    }

    public OrderInfos getOrderInfos() {
        return orderInfos;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
