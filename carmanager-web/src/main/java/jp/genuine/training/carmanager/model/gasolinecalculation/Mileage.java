package jp.genuine.training.carmanager.model.gasolinecalculation;

public class Mileage {

	private int value;

	public Mileage() {
	}

	public Mileage(int value) {
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
		return String.format("Mileage [value=%s]", value);
	}



}
