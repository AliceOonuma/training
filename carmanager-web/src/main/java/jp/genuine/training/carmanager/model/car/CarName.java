package jp.genuine.training.carmanager.model.car;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class CarName implements Serializable{

	@NotEmpty
	@Length(max=10)
	private String value;

	public CarName() {
		value = "";
	}

	public CarName(String value) {
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
		return String.format("CarName [value=%s]", value);
	}


	private static final long serialVersionUID = 2974796535133586335L;

}
