package jp.genuine.training.carmanager.model.car;

import java.io.Serializable;

import javax.validation.Valid;

import jp.genuine.training.carmanager.model.car.initialstatus.GasolineQuantity;
import jp.genuine.training.carmanager.model.car.initialstatus.InitialOdometer;

public class CarRegister implements Serializable{

	@Valid
	private CarId carId;
	@Valid
	private CarName carName;
	@Valid
	private GasolineTankCapacity gasolineTankCapacity;
	@Valid
	private GasolineType gasolineType;
	@Valid
	private Memo memo;
	@Valid
	private GasolineQuantity gasolineQuantity;
	@Valid
	private InitialOdometer initialOdometer;

	public CarRegister(CarId carId){
		this.carId = carId;
		carName = new CarName();
		gasolineTankCapacity = new GasolineTankCapacity();
		gasolineType = new GasolineType();
		memo = new Memo();
		gasolineQuantity = new GasolineQuantity();
		initialOdometer = new InitialOdometer();
	}

	public CarRegister() {
		carId = new CarId();
		carName = new CarName();
		gasolineTankCapacity = new GasolineTankCapacity();
		gasolineType = new GasolineType();
		memo = new Memo();
		gasolineQuantity = new GasolineQuantity();
		initialOdometer = new InitialOdometer();
	}

	public CarRegister(CarId carId, CarName carName, GasolineTankCapacity gasolineTankCapacity,
			GasolineType gasolineType, Memo memo, GasolineQuantity gasolineQuantity, InitialOdometer initialOdometer) {
		this.carId = carId;
		this.carName = carName;
		this.gasolineTankCapacity = gasolineTankCapacity;
		this.gasolineType = gasolineType;
		this.memo = memo;
		this.gasolineQuantity = gasolineQuantity;
		this.initialOdometer = initialOdometer;
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

	public GasolineQuantity getGasolineQuantity() {
		return gasolineQuantity;
	}

	public InitialOdometer getInitialOdometer() {
		return initialOdometer;
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

	public void setGasolineQuantity(GasolineQuantity gasolineQuantity) {
		this.gasolineQuantity = gasolineQuantity;
	}

	public void setInitialOdometer(InitialOdometer initialOdometer) {
		this.initialOdometer = initialOdometer;
	}

	@Override
	public String toString() {
		return String.format(
				"CarRegister [carId=%s, carName=%s, gasolineTankCapacity=%s, gasolineType=%s, memo=%s, gasolineQuantity=%s, initialOdometer=%s]",
				carId, carName, gasolineTankCapacity, gasolineType, memo, gasolineQuantity, initialOdometer);
	}


	private static final long serialVersionUID = 8504779278850274127L;

}
