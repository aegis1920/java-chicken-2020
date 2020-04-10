package domain;

public class Count {
	public static final int MAX_MENU_COUNT = 99;
	public static final int MIN_MENU_COUNT = 0;
	public static final int DISCOUNT_STANDARD = 10;

	private long count;

	public Count(final long count) {
		validate(count);
		this.count = count;
	}

	private void validate(final long count) {
		if (count > MAX_MENU_COUNT || count < MIN_MENU_COUNT) {
			System.out.println(count);
			throw new IllegalArgumentException("한 테이블에서 주문할 수 있는 한 메뉴의 최대 수량은 99개 이하, 1개 이상이어야 합니다!");
		}
	}

	private long addValue(final long value) {
		return this.count + value;
	}

	public Count add(final Count count) {
		return new Count(count.addValue(this.count));
	}

	public boolean isPossibleDiscount() {
		return this.count > DISCOUNT_STANDARD;
	}

	public long discountCount() {
		return this.count / DISCOUNT_STANDARD;
	}

	public long getCount() {
		return count;
	}

	public long multiply(final int price) {
		return price * count;
	}
}
