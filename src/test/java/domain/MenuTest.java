package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MenuTest {
    @DisplayName("정수값을 줬을 때 이것이 자신의 메뉴와 맞는 메뉴인지 확인하는 테스트")
    @Test
    void isRightMenuTest() {
        int menuNumber = 1;
        Menu menu = MenuRepository.getMenu(menuNumber);

        assertThat(menu.isRightMenu(menuNumber)).isTrue();
    }
}