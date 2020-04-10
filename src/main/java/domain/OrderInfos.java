package domain;

import java.util.List;

public class OrderInfos {
    private List<OrderInfo> orderInfos;

    public OrderInfos(final List<OrderInfo> orderInfos) {
        this.orderInfos = orderInfos;
    }

    public void add(final OrderInfo orderInfo) {
        orderInfos.add(orderInfo);
    }

    public Count countChicken() {
        return orderInfos.stream()
            .filter(OrderInfo::isChickenMenu)
            .map(orderInfo -> orderInfo.addCount(new Count(0)))
            .reduce(Count::add)
            .orElse(new Count(0));
    }

    public boolean isOrder() {
        return !orderInfos.isEmpty();
    }

    public List<OrderInfo> getOrderInfos() {
        return orderInfos;
    }

    public long calculate() {
        return orderInfos.stream()
            .mapToLong(OrderInfo::calculate)
            .sum();
    }

    public void clean() {
        orderInfos.clear();
    }
}
