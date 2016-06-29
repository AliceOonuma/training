package jp.genuine.training.carmanager.model.oiling;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class OilingQuantity implements Serializable{

	@NotEmpty
	private String value;

	public OilingQuantity() {
		value = "";
	}

	public OilingQuantity(String value) {
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
		return String.format("OilingQuantity [value=%s]", value);
	}


	private static final long serialVersionUID = -5271962596450543743L;

}
