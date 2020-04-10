package Service;

import domain.Payment;
import domain.Table;
import domain.TableRepository;

public class ChickenService {
    private static final ChickenService CHICKEN_SERVICE = new ChickenService();

    public static ChickenService getInstance() {
        return CHICKEN_SERVICE;
    }

    public void orderMenu(final int tableNumber, final int menuNumber, final int countNumber) {
        Table table = TableRepository.getTable(tableNumber);
        table.addMenu(menuNumber, countNumber);
    }

    public long calculate(final int tableNumber, final int paymentNumber) {
        Table table = TableRepository.getTable(tableNumber);
        long totalPrice = table.calculateTotal();
        table.clean();
        return Payment.calculateDiscount(paymentNumber, totalPrice);
    }
}
