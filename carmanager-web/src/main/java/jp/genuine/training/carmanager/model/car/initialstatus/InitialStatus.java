package jp.genuine.training.carmanager.model.car.initialstatus;

import java.io.Serializable;


public class InitialStatus implements Serializable{

	private GasolineQuantity gasolineQuantity;
	private InitialOdometer initialOdometer;

	public InitialStatus() {
		gasolineQuantity = new GasolineQuantity();
		initialOdometer = new InitialOdometer();
	}

	public InitialStatus(GasolineQuantity gasolineQuantity, InitialOdometer initialOdometer) {
		super();
		this.gasolineQuantity = gasolineQuantity;
		this.initialOdometer = initialOdometer;
	}


	public GasolineQuantity getGasolineQuantity() {
		return gasolineQuantity;
	}

	public InitialOdometer getInitialOdometer() {
		return initialOdometer;
	}


	public void setGasolineQuantity(GasolineQuantity gasolineQuantity) {
		this.gasolineQuantity = gasolineQuantity;
	}

	public void setInitialOdometer(InitialOdometer initialOdometer) {
		this.initialOdometer = initialOdometer;
	}

	@Override
	public String toString() {
		return String.format("InitialStatus [gasolineQuantity=%s, initialOdometer=%s]",
				gasolineQuantity, initialOdometer);
	}


	private static final long serialVersionUID = -7153757145061821132L;

}
