package jp.genuine.training.carmanager.model.car;

public class GasolineType {

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



}
