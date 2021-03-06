package jp.genuine.training.carmanager.model.oiling;

import java.io.Serializable;

public class GasolineQuantity implements Serializable{

	private String value;

	public GasolineQuantity() {
		value = "";
	}

	public GasolineQuantity(String value) {
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
		return String.format("GasolineQuantity [value=%s]", value);
	}


	private static final long serialVersionUID = 8698396080452996862L;

}
