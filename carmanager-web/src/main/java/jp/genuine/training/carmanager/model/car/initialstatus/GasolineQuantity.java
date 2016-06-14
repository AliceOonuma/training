package jp.genuine.training.carmanager.model.car.initialstatus;

public class GasolineQuantity {

	private int value;

	public GasolineQuantity() {
	}

	public GasolineQuantity(int value) {
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
		return String.format("GasolineQuantity [value=%s]", value);
	}



}
