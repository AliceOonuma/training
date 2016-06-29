package jp.genuine.training.carmanager.model.oiling;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class Odometer implements Serializable{


	@NotEmpty
	private String value;

	public Odometer() {
		value = "";
	}

	public Odometer(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public int getIntValue(){
		int i = Integer.parseInt(value);
		return i;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("Odometer [value=%s]", value);
	}

	private static final long serialVersionUID = -5574277850270289081L;

}
