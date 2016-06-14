package jp.genuine.training.carmanager.model.oiling;

import java.io.Serializable;
import java.time.LocalDate;

public class OilingDate implements Serializable{

	private static final long serialVersionUID = -7815732197353344534L;
	private LocalDate value;

	public OilingDate() {
		value = LocalDate.now();
	}

	public OilingDate(LocalDate value) {
		this.value = value;
	}

	public LocalDate getValue() {
		return value;
	}

	public void setValue(LocalDate value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("OilingDate [value=%s]", value);
	}



}
