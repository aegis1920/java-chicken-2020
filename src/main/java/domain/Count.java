package domain;

public class Count {
	private long count;

	public Count(final long count) {
		validate(count);
		this.count = count;
	}

	private void validate(final long count) {
		if (count > 99 || count < 1) {
			throw new IllegalArgumentException("한 테이블에서 주문할 수 있는 한 메뉴의 최대 수량은 99개 이하, 1개 이상이어야 합니다!");
		}
	}

	private long addValue(long value) {
		return this.count + value;
	}

	public Count add(final Count count) {
		return new Count(count.addValue(this.count));
	}

	public long getCount() {
		return count;
	}
}
