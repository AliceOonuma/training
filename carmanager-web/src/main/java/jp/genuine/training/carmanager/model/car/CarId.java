package jp.genuine.training.carmanager.model.car;

import java.io.Serializable;

public class CarId implements Serializable{

	private Integer value;

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


	private static final long serialVersionUID = -6263190783339380911L;

}
