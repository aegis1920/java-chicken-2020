package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OrderInfoTest {
    @DisplayName("OrderInfo를 생성할 때 제대로 생성되는지 테스트")
    @Test
    void orderInfoConstructorTest() {
        assertThat(new OrderInfo(MenuRepository.getMenu(1), new Count(30))).isNotNull();
    }
}
