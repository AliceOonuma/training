package jp.genuine.training.carmanager.model.car;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class GasolineType implements Serializable{

	@NotEmpty
	private String value;

	private String name;

	public GasolineType() {
		value = "";
		name = "";
	}

	public GasolineType(String value,String name) {
		super();
		this.value = value;
		this.name = name ;
	}

	public String getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return String.format("GasolineType [value=%s, name=%s]", value, name);
	}


	private static final long serialVersionUID = 966601351765188288L;

}
