package jp.genuine.training.carmanager.model.car.initialstatus;

import java.io.Serializable;

public class InitialOdometer implements Serializable{

	private Integer value;

	public InitialOdometer() {
	}

	public InitialOdometer(Integer value) {
		super();
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
		return String.format("InitialOdometer [value=%s]", value);
	}

	private static final long serialVersionUID = 1591490440919229297L;

}
