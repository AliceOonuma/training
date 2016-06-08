package jp.genuine.training.carmanager.model.user;

public class UserId {
	private int value;

	public UserId() {
	}

	public UserId(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("UserId [value=%s]", value);
	}


}