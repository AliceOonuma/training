package jp.genuine.training.carmanager.model.car.initialstatus;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class GasolineQuantity implements Serializable{

	@NotEmpty
	private String value;

	public GasolineQuantity() {
		value = "";
	}

	public GasolineQuantity(String value) {
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
		return String.format("GasolineQuantity [value=%s]", value);
	}


	private static final long serialVersionUID = -3345652597595897791L;

}
