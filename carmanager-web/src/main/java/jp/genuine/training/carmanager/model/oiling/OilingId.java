package jp.genuine.training.carmanager.model.oiling;

public class OilingId {

	private int value;

	public OilingId() {
	}

	public OilingId(int value) {
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
		return String.format("OilingId [value=%s]", value);
	}



}
