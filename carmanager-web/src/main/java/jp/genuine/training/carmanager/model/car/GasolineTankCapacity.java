package jp.genuine.training.carmanager.model.car;

import java.io.Serializable;

public class GasolineTankCapacity implements Serializable{

	private Integer value;

	public GasolineTankCapacity() {
	}

	public GasolineTankCapacity(Integer value) {
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
		return String.format("GasolineTankCapacity [value=%s]", value);
	}

	private static final long serialVersionUID = 7550303798944651847L;

}
