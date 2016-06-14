package jp.genuine.training.carmanager.model.oiling;

public class GasolinePrice {

	private int value;

	public GasolinePrice() {
	}

	public GasolinePrice(int value) {
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
		return String.format("GasolinePrice [value=%s]", value);
	}



}
