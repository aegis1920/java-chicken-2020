package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CountTest {
	@DisplayName("메뉴의 수량을 입력받을 때 99개가 넘으면 예외를 던지는 메서드 테스트")
	@Test
	void countExceptionConstructorTest() {
		assertThatThrownBy(() -> {
			new Count(100);
		}).isInstanceOf(IllegalArgumentException.class);
	}

	@DisplayName("메뉴의 수량을 입력받을 때 정상적인 갯수를 입력하면 정상적으로 생성되는지 테스트")
	@Test
	void countNewConstructorTest() {
		assertThat(new Count(30)).isNotNull();
	}

	@DisplayName("메뉴의 수량을 더했을 때 더한 값을 새로운 인스턴스로 만들어 정상적으로 생성해주는지 테스트")
	@Test
	void addConstructorTest() {
		Count firstCount = new Count(40);
		Count secondCount = new Count(30);
		assertThat(firstCount.add(secondCount).getCount()).isEqualTo(70);
	}
}
