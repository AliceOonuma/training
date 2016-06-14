package jp.genuine.training.carmanager.model.car;

public class GasolineTankCapacity {

	private int value;

	public GasolineTankCapacity() {
	}

	public GasolineTankCapacity(int value) {
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
		return String.format("GasolineTankCapacity [value=%s]", value);
	}


}