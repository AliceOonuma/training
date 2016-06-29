package jp.genuine.training.carmanager.model.oiling;

import java.io.Serializable;

import javax.validation.Valid;

import jp.genuine.training.carmanager.model.car.CarId;

public class Oiling implements Serializable{

	@Valid
	private OilingId oilingId;
	@Valid
	private CarId carId;
	@Valid
	private OilingDate oilingDate;
	@Valid
	private GasolinePrice gasolinePrice;
	@Valid
	private GasolineQuantity gasolineQuantity;
	@Valid
	private OilingQuantity oilingQuantity;
	@Valid
	private Memo memo;
	@Valid
	private Odometer odometer;

	public Oiling() {
		oilingId = new OilingId();
		carId = new CarId();
		oilingDate = new OilingDate();
		gasolinePrice = new GasolinePrice();
		gasolineQuantity = new GasolineQuantity();
		oilingQuantity = new OilingQuantity();
		memo = new Memo();
		odometer = new Odometer();
	}

	public Oiling(OilingId oilingId){
		this.oilingId = oilingId;
		carId = new CarId();
		oilingDate = new OilingDate();
		gasolinePrice = new GasolinePrice();
		gasolineQuantity = new GasolineQuantity();
		oilingQuantity = new OilingQuantity();
		memo = new Memo();
		odometer = new Odometer();
	}

	public Oiling(OilingId oilingId, CarId carId, OilingDate oilingDate, GasolinePrice gasolinePrice,
			GasolineQuantity gasolineQuantity, OilingQuantity oilingQuantity, Memo memo, Odometer odometer) {
		super();
		this.oilingId = oilingId;
		this.carId = carId;
		this.oilingDate = oilingDate;
		this.gasolinePrice = gasolinePrice;
		this.gasolineQuantity = gasolineQuantity;
		this.oilingQuantity = oilingQuantity;
		this.memo = memo;
		this.odometer = odometer;
	}

	public OilingId getOilingId() {
		return oilingId;
	}

	public CarId getCarId() {
		return carId;
	}

	public OilingDate getOilingDate() {
		return oilingDate;
	}

	public GasolinePrice getGasolinePrice() {
		return gasolinePrice;
	}

	public GasolineQuantity getGasolineQuantity() {
		return gasolineQuantity;
	}

	public OilingQuantity getOilingQuantity() {
		return oilingQuantity;
	}

	public Memo getMemo() {
		return memo;
	}

	public Odometer getOdometer() {
		return odometer;
	}

	public void setOilingId(OilingId oilingId) {
		this.oilingId = oilingId;
	}

	public void setCarId(CarId carId) {
		this.carId = carId;
	}

	public void setOilingDate(OilingDate oilingDate) {
		this.oilingDate = oilingDate;
	}

	public void setGasolinePrice(GasolinePrice gasolinePrice) {
		this.gasolinePrice = gasolinePrice;
	}

	public void setGasolineQuantity(GasolineQuantity gasolineQuantity) {
		this.gasolineQuantity = gasolineQuantity;
	}

	public void setOilingQuantity(OilingQuantity oilingQuantity) {
		this.oilingQuantity = oilingQuantity;
	}

	public void setMemo(Memo memo) {
		this.memo = memo;
	}

	public void setOdometer(Odometer odometer) {
		this.odometer = odometer;
	}

	@Override
	public String toString() {
		return String.format(
				"Oiling [oilingId=%s, carId=%s, oilingDate=%s, gasolinePrice=%s, gasolineQuantity=%s, oilingQuantity=%s, memo=%s, odometer=%s]",
				oilingId, carId, oilingDate, gasolinePrice, gasolineQuantity, oilingQuantity, memo, odometer);
	}

	private static final long serialVersionUID = -8546412630597935961L;

}
