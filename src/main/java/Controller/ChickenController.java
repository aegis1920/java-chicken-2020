package Controller;

import java.util.List;

import Service.ChickenService;
import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;
import view.InputView;
import view.OutputView;

public class ChickenController {
    final List<Table> tables = TableRepository.tables();
    final List<Menu> menus = MenuRepository.menus();

    public void run() {
        ChickenService chickenService = ChickenService.getInstance();
        do {
            OutputView.printMainInstruction();
            final int functionNumber = InputView.inputFunctionNumber();

            if (functionNumber == 1) {
                OutputView.printTables(tables);
                final int tableNumber = InputView.inputTableNumber();
                OutputView.printMenus(menus);
                final int menuNumber = InputView.inputMenuNumber();
                final int countNumber = InputView.inputCountNumber();

                chickenService.orderMenu(tableNumber, menuNumber, countNumber);
            }

            if (functionNumber == 2) {
                OutputView.printTables(tables);
                final int tableNumber = InputView.inputTableNumber();
                OutputView.printOrder(TableRepository.getTable(tableNumber));
                final int paymentNumber = InputView.inputPaymentNumber(tableNumber);

                final long totalPrice = chickenService.calculate(tableNumber, paymentNumber);
                OutputView.printTotalPrice(totalPrice);
            }

            if (functionNumber == 3) {
                break;
            }

        } while (true);
    }
}
