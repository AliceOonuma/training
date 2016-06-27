package jp.genuine.training.carmanager.model.car.initialstatus;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class InitialOdometer implements Serializable{

	@NotEmpty
	private String value;

	public InitialOdometer() {
		value = "";
	}

	public InitialOdometer(String value) {
		super();
		this.value = value;
	}

	public int getIntValue(){
		int i = Integer.parseInt(value);
		return i;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("InitialOdometer [value=%s]", value);
	}

	private static final long serialVersionUID = 1591490440919229297L;

}
