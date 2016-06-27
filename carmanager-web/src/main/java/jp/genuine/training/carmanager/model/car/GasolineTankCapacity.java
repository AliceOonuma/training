package jp.genuine.training.carmanager.model.car;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class GasolineTankCapacity implements Serializable{

	@NotEmpty
	private String value;

	public GasolineTankCapacity() {
		value = "";
	}

	public GasolineTankCapacity(String value) {
		super();
		this.value = value;
	}

	public int getIntValue(){
		int i = Integer.parseInt(value);
		return i;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("GasolineTankCapacity [value=%s]", value);
	}

	private static final long serialVersionUID = 7550303798944651847L;

}
