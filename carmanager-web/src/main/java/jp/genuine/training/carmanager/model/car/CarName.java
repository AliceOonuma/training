package jp.genuine.training.carmanager.model.car;

public class CarName {

	private String value;

	public CarName() {
		value = "";
	}

	public CarName(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("CarName [value=%s]", value);
	}



}
