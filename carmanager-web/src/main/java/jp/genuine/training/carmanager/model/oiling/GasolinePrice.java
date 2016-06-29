package jp.genuine.training.carmanager.model.oiling;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class GasolinePrice implements Serializable{

	@NotEmpty
	private String value;

	public GasolinePrice() {
		value = "";
	}

	public GasolinePrice(String value) {
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
		return String.format("GasolinePrice [value=%s]", value);
	}


	private static final long serialVersionUID = -38184874327506939L;

}
