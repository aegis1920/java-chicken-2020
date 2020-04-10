package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MenuRepositoryTest {

    @DisplayName("MenuRepository 에서 메뉴를 가져올 때 정확히 가져오는지 테스트")
    @Test
    void getMenuTest() {
        int menuNumber = 1;
        assertThat(MenuRepository.getMenu(menuNumber).isRightMenu(menuNumber)).isTrue();
    }

    @DisplayName("MenuRepository 에서 메뉴를 잘못가져올 때 에러를 내는지 테스트")
    @Test
    void getMenuExceptionTest() {
        int menuNumber = 999;

        assertThatThrownBy(() -> {
            MenuRepository.getMenu(menuNumber);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}