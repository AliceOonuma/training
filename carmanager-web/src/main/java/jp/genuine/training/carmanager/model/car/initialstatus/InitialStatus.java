package jp.genuine.training.carmanager.model.car.initialstatus;

import jp.genuine.training.carmanager.model.car.CarId;

public class InitialStatus {

	private CarId carId;
	private GasolineQuantity gasolineQuantity;
	private InitialOdometer initialOdometer;

	public InitialStatus() {
		carId = new CarId();
		gasolineQuantity = new GasolineQuantity();
		initialOdometer = new InitialOdometer();
	}

	public InitialStatus(CarId carId, GasolineQuantity gasolineQuantity, InitialOdometer initialOdometer) {
		super();
		this.carId = carId;
		this.gasolineQuantity = gasolineQuantity;
		this.initialOdometer = initialOdometer;
	}

	public CarId getCarId() {
		return carId;
	}

	public GasolineQuantity getGasolineQuantity() {
		return gasolineQuantity;
	}

	public InitialOdometer getInitialOdometer() {
		return initialOdometer;
	}

	public void setCarId(CarId carId) {
		this.carId = carId;
	}

	public void setGasolineQuantity(GasolineQuantity gasolineQuantity) {
		this.gasolineQuantity = gasolineQuantity;
	}

	public void setInitialOdometer(InitialOdometer initialOdometer) {
		this.initialOdometer = initialOdometer;
	}

	@Override
	public String toString() {
		return String.format("InitialStatus [carId=%s, gasolineQuantity=%s, initialOdometer=%s]", carId,
				gasolineQuantity, initialOdometer);
	}



}
