package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputFunctionNumber() {
        System.out.println("## 원하는 기능을 선택하세요.");
        return scanner.nextInt();
    }

    public static int inputTableNumber() {
        System.out.println("## 주문할 테이블을 선택하세요.");
        return scanner.nextInt();
    }

    public static int inputMenuNumber() {
        System.out.println("## 등록할 메뉴를 선택하세요.");
        return scanner.nextInt();
    }

    public static int inputCountNumber() {
        System.out.println("## 주문할 수량을 선택하세요.");
        return scanner.nextInt();
    }

    public static int inputPaymentNumber(int tableNumber) {
        System.out.println(tableNumber + "번 테이블의 결제를 진행합니다.");
        System.out.println("신용카드는 1번, 현금결제는 2번을 선택하세요");
        return scanner.nextInt();
    }
}
