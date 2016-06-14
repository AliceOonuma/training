package jp.genuine.training.carmanager.model.oiling;

import java.io.Serializable;

public class OilingQuantity implements Serializable{

	private Integer value;

	public OilingQuantity() {
	}

	public OilingQuantity(int value) {
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
		return String.format("OilingQuantity [value=%s]", value);
	}


	private static final long serialVersionUID = -5271962596450543743L;

}
