package jp.genuine.training.carmanager.model.car;

import java.io.Serializable;

public class CarId implements Serializable{

	private Integer value;

	public CarId() {
	}

	public CarId(Integer value) {
		super();
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("CarId [value=%s]", value);
	}


	private static final long serialVersionUID = -6263190783339380911L;

}
