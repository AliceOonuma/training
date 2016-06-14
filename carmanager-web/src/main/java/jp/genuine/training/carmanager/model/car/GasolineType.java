package jp.genuine.training.carmanager.model.car;

import java.io.Serializable;

public class GasolineType implements Serializable{

	private String value;

	public GasolineType() {
		value = "";
	}

	public GasolineType(String value) {
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
		return String.format("GasolineType [value=%s]", value);
	}


	private static final long serialVersionUID = 966601351765188288L;

}
