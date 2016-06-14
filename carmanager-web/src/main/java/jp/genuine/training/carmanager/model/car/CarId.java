package jp.genuine.training.carmanager.model.car;

public class CarId {

	private int value;

	public CarId() {
	}

	public CarId(int value) {
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
		return String.format("CarId [value=%s]", value);
	}



}
