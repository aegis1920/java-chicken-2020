package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CountTest {
	@DisplayName("메뉴의 수량을 입력받을 때 99개가 넘으면 예외를 던지는 메서드 테스트")
	@Test
	void countConstructorTest() {
		assertThatThrownBy(() -> {
			new Count(100);
		}).isInstanceOf(IllegalArgumentException.class);
	}
}
