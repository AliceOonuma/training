package jp.genuine.training.carmanager.model.gasolinecalculation;

import java.io.Serializable;

public class GasolinePrice implements Serializable{

	private Integer value;

	public GasolinePrice() {
	}

	public GasolinePrice(int value) {
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
		return String.format("GasolinePrice [value=%s]", value);
	}


	private static final long serialVersionUID = 7137268646802645046L;

}
