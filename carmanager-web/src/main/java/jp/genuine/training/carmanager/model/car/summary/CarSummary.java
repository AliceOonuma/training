package jp.genuine.training.carmanager.model.car.summary;

import java.io.Serializable;

import jp.genuine.training.carmanager.model.car.CarId;
import jp.genuine.training.carmanager.model.car.CarName;

public class CarSummary implements Serializable{

	private CarId carId;
	private CarName carName;

	public CarSummary() {
		carId = new CarId();
		carName = new CarName();
	}

	public CarSummary(CarId carId, CarName carName) {
		super();
		this.carId = carId;
		this.carName = carName;
	}

	public CarId getCarId() {
		return carId;
	}

	public CarName getCarName() {
		return carName;
	}

	public void setCarId(CarId carId) {
		this.carId = carId;
	}

	public void setCarName(CarName carName) {
		this.carName = carName;
	}

	@Override
	public String toString() {
		return String.format("CarSummary [carId=%s, carName=%s]", carId, carName);
	}

	private static final long serialVersionUID = -3733757583005320401L;
}
