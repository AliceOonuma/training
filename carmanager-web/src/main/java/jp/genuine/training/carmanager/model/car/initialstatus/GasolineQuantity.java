package jp.genuine.training.carmanager.model.car.initialstatus;

import java.io.Serializable;

public class GasolineQuantity implements Serializable{

	private Integer value;

	public GasolineQuantity() {
	}

	public GasolineQuantity(int value) {
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
		return String.format("GasolineQuantity [value=%s]", value);
	}


	private static final long serialVersionUID = -3345652597595897791L;

}
