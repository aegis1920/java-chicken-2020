package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PaymentTest {
    @DisplayName("카드 결제 방법으로 최종 금액을 넣었을 때 할인된 값이 나오는지 테스트")
    @Test
    void calculateDiscountOfCardTest() {
        int cashPayment = 1;
        long totalPrice = 10000L;

        long expected = 9500L;
        assertThat(Payment.calculateDiscount(cashPayment, totalPrice)).isEqualTo(expected);

    }

    @DisplayName("현금 결제 방법으로 최종 금액을 넣었을 때 그대로인 값이 나오는지 테스트")
    @Test
    void calculateDiscountOfCashTest() {
        int cashPayment = 2;
        long totalPrice = 10000L;

        long expected = 10000L;
        assertThat(Payment.calculateDiscount(cashPayment, totalPrice)).isEqualTo(expected);
    }
}
