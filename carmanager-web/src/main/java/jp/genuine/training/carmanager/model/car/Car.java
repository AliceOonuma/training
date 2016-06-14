package jp.genuine.training.carmanager.model.car;

import java.io.Serializable;

public class Car implements Serializable{


	private CarId carId;
	private CarName carName;
	private GasolineTankCapacity gasolineTankCapacity;
	private GasolineType gasolineType;
	private Memo memo;

	public Car() {
		carId = new CarId();
		carName = new CarName();
		gasolineTankCapacity = new GasolineTankCapacity();
		gasolineType = new GasolineType();
		memo = new Memo();
	}

	public Car(CarId carId, CarName carName, GasolineTankCapacity gasolineTankCapacity, GasolineType gasolineType,
			Memo memo) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.gasolineTankCapacity = gasolineTankCapacity;
		this.gasolineType = gasolineType;
		this.memo = memo;
	}

	public CarId getCarId() {
		return carId;
	}

	public CarName getCarName() {
		return carName;
	}

	public GasolineTankCapacity getGasolineTankCapacity() {
		return gasolineTankCapacity;
	}

	public GasolineType getGasolineType() {
		return gasolineType;
	}

	public Memo getMemo() {
		return memo;
	}

	public void setCarId(CarId carId) {
		this.carId = carId;
	}

	public void setCarName(CarName carName) {
		this.carName = carName;
	}

	public void setGasolineTankCapacity(GasolineTankCapacity gasolineTankCapacity) {
		this.gasolineTankCapacity = gasolineTankCapacity;
	}

	public void setGasolineType(GasolineType gasolineType) {
		this.gasolineType = gasolineType;
	}

	public void setMemo(Memo memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {
		return String.format("Car [carId=%s, carName=%s, gasolineTankCapacity=%s, gasolineType=%s, memo=%s]", carId,
				carName, gasolineTankCapacity, gasolineType, memo);
	}

	private static final long serialVersionUID = -4838726199260167800L;

}
