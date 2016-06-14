package jp.genuine.training.carmanager.model.gasolinecalculation;

import java.io.Serializable;

public class FuelConsumption implements Serializable{

	private Integer value;

	public FuelConsumption() {
	}

	public FuelConsumption(Integer value) {
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
		return String.format("FuelConsumption [value=%s]", value);
	}


	private static final long serialVersionUID = 4180544911151393210L;

}
