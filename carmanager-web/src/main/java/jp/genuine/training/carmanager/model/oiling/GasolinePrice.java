package jp.genuine.training.carmanager.model.oiling;

import java.io.Serializable;

public class GasolinePrice implements Serializable{

	private Integer value;

	public GasolinePrice() {
	}

	public GasolinePrice(Integer value) {
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
		return String.format("GasolinePrice [value=%s]", value);
	}


	private static final long serialVersionUID = -38184874327506939L;

}
