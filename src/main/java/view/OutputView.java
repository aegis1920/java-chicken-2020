package view;

import java.util.List;

import domain.Menu;
import domain.OrderInfo;
import domain.Table;

public class OutputView {
    private static final String TOP_LINE = "┌ ─ ┐";
    private static final String TABLE_FORMAT = "| %s |";
    private static final String BOTTOM_LINE = "└ ─ ┘";
    private static final String BOTTOM_ORDERED_LINE = "└ ₩ ┘";

    public static void printTables(final List<Table> tables) {
        System.out.println("## 테이블 목록");
        final int size = tables.size();
        printLine(TOP_LINE, size);
        printTableNumbers(tables);
        printLoopBottomLine(tables);
    }

    public static void printMenus(final List<Menu> menus) {
        for (final Menu menu : menus) {
            System.out.println(menu);
        }
    }

    private static void printLine(final String line, final int count) {
        for (int index = 0; index < count; index++) {
            System.out.print(line);
        }
        System.out.println();
    }

    private static void printLoopBottomLine(final List<Table> tables) {
        for (final Table table : tables) {
            printBottomLine2(table);
        }
        System.out.println();
    }

    private static void printBottomLine2(final Table table) {
        if (table.isOrder()) {
            System.out.printf(BOTTOM_ORDERED_LINE, table);
            return;
        }
        System.out.printf(BOTTOM_LINE, table);
    }

    private static void printTableNumbers(final List<Table> tables) {
        for (final Table table : tables) {
            System.out.printf(TABLE_FORMAT, table);
        }
        System.out.println();
    }

    public static void printMainInstruction() {
        System.out.println("## 메인화면");
        System.out.println("1 - 주문등록");
        System.out.println("2 - 결제하기");
        System.out.println("3 - 프로그램 종료");
    }

    public static void printOrder(final Table table) {
        System.out.println("## 주문내역");
        System.out.println("메뉴 수량 금액");

        for (final OrderInfo orderInfo : table.getOrderInfos().getOrderInfos()) {
            System.out.println(orderInfo.getMenu());
        }
    }

    public static void printTotalPrice(final long totalPrice) {
        System.out.println("## 최종 결제할 금액");
        System.out.println(totalPrice + "원");
    }
}
