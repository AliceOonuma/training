package jp.genuine.training.carmanager.model.gasolinecalculation;

import java.io.Serializable;

public class Mileage implements Serializable{

	private Integer value;

	public Mileage() {
	}

	public Mileage(Integer value) {
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
		return String.format("Mileage [value=%s]", value);
	}


	private static final long serialVersionUID = -1446616758746150571L;

}
