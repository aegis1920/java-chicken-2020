package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TableTest {

    @BeforeEach
    void setUp() {
        int tableNumber = 1;

        Table table = TableRepository.getTable(tableNumber);
        table.clean();
    }

    @DisplayName("테이블을 Clean하고 나서 비어있는지 확인하는 테스트")
    @Test
    public void cleanTest() {
        int tableNumber = 1;
        Table table = TableRepository.getTable(tableNumber);
        table.addMenu(1, 30);
        table.clean();

        assertThat(table.getOrderInfos().getOrderInfos().isEmpty()).isTrue();
    }

    @DisplayName("테이블이 주문했는지 안 했는지 확인하는 테스트")
    @Test
    public void isOrderTest() {
        int tableNumber = 1;
        Table table = TableRepository.getTable(tableNumber);
        table.addMenu(1, 30);

        assertThat(table.isOrder()).isTrue();
    }

    @DisplayName("최종 값을 계산하는 테스트")
    @Test
    public void calculateTotalTest() {
        int tableNumber = 1;
        Table table = TableRepository.getTable(tableNumber);
        table.addMenu(1, 30);
        table.addMenu(2, 30);
        assertThat(table.calculateTotal()).isEqualTo(960000L);
    }
}
