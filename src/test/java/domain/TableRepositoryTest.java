package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TableRepositoryTest {

    @DisplayName("TableRepository 에서 테이블을 가져올 때 정확히 가져오는지 테스트")
    @Test
    void getTableTest() {
        int tableNumber = 1;
        assertThat(TableRepository.getTable(tableNumber).isRightTable(tableNumber)).isTrue();
    }

    @DisplayName("TableRepository 에서 테이블을 잘못가져올 때 에러를 내는지 테스트")
    @Test
    void getTableExceptionTest() {
        int tableNumber = 999;

        assertThatThrownBy(() -> {
            TableRepository.getTable(tableNumber);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}