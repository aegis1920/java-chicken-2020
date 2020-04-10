package domain;

import java.util.Arrays;

public enum Payment {
	CARD(1, 0.95),
	CASH(2, 1);

	private int number;
	private double discountValue;

	Payment(final int number, final double discountValue) {
		this.number = number;
		this.discountValue = discountValue;
	}

	private static Payment of(int number) {
		return Arrays.stream(Payment.values())
			.filter(payment -> payment.number == number) // TODO : 메서드로 빼기
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("다른 종류의 결제 방법이 없습니다! 1과 2 중에서 선택해주세요!"));
	}

	public static long calculateDiscount(int number, long totalPrice) {
		return Math.round(totalPrice * of(number).discountValue);
	}
}
