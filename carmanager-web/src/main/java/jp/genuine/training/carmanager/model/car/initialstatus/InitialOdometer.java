package jp.genuine.training.carmanager.model.car.initialstatus;

public class InitialOdometer {

	private int value;

	public InitialOdometer() {
	}

	public InitialOdometer(int value) {
		super();
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
		return String.format("InitialOdometer [value=%s]", value);
	}



}
