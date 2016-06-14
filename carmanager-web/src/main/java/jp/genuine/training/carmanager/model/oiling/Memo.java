package jp.genuine.training.carmanager.model.oiling;

import java.io.Serializable;

public class Memo implements Serializable{

	private String value;

	public Memo() {
		value = "";
	}

	public Memo(String value) {
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
		return String.format("Memo [value=%s]", value);
	}


	private static final long serialVersionUID = 6580005318818936839L;

}
