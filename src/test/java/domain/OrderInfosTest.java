package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OrderInfosTest {

    @DisplayName("테이블의 치킨 갯수를 리턴하는 메서드 테스트")
    @Test
    void countChickenTest() {
        int tableNumber = 1;

        Table table = TableRepository.getTable(tableNumber);
        table.addMenu(1, 30);
        table.addMenu(2, 30);
        table.addMenu(21, 30);

        Count count = table.countChicken();

        assertThat(count.getCount()).isEqualTo(60);
    }
}