package jp.genuine.training.carmanager.model.gasolinecalculation;

public class GasolineCalculation {

	private FuelConsumption fuelConsumption;
	private GasolinePrice gasolinePrice;
	private Mileage mileage;

	public GasolineCalculation() {
		fuelConsumption = new FuelConsumption();
		gasolinePrice = new GasolinePrice();
		mileage = new Mileage();
	}

	public GasolineCalculation(FuelConsumption fuelConsumption, GasolinePrice gasolinePrice, Mileage mileage) {
		super();
		this.fuelConsumption = fuelConsumption;
		this.gasolinePrice = gasolinePrice;
		this.mileage = mileage;
	}

	public FuelConsumption getFuelConsumption() {
		return fuelConsumption;
	}

	public GasolinePrice getGasolinePrice() {
		return gasolinePrice;
	}

	public Mileage getMileage() {
		return mileage;
	}

	public void setFuelConsumption(FuelConsumption fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public void setGasolinePrice(GasolinePrice gasolinePrice) {
		this.gasolinePrice = gasolinePrice;
	}

	public void setMileage(Mileage mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return String.format("GasolineCalcuration [fuelConsumption=%s, gasolinePrice=%s, mileage=%s]", fuelConsumption,
				gasolinePrice, mileage);
	}


}
