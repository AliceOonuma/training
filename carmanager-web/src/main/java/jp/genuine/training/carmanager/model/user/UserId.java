package jp.genuine.training.carmanager.model.user;

public class UserId {
	private Integer value;

	public UserId() {
	}

	public UserId(Integer value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("UserId [value=%s]", value);
	}


}
