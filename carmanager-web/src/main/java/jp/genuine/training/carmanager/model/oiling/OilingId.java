package jp.genuine.training.carmanager.model.oiling;

import java.io.Serializable;

public class OilingId implements Serializable{

	private Integer value;

	public OilingId() {
	}

	public OilingId(Integer value) {
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
		return String.format("OilingId [value=%s]", value);
	}


	private static final long serialVersionUID = 6011403518113295121L;

}
