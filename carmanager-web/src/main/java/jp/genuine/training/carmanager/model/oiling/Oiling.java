package jp.genuine.training.carmanager.model.oiling;

import java.time.LocalDate;

import jp.genuine.training.carmanager.model.car.CarId;

public class Oiling {

	private OilingId oilingId;
	private CarId carId;
	private LocalDate oilingDate;
	private GasolinePrice gasolinePrice;
	private GasolineQuantity gasolineQuantity;
	private OilingQuantity oilingQuantity;
	private Memo memo;

	public Oiling() {
		oilingId = new OilingId();
		carId = new CarId();
		oilingDate = LocalDate.now();
		gasolinePrice = new GasolinePrice();
		gasolineQuantity = new GasolineQuantity();
		oilingQuantity = new OilingQuantity();
		memo = new Memo();
	}

	public Oiling(OilingId oilingId, CarId carId, LocalDate oilingDate, GasolinePrice gasolinePrice,
			GasolineQuantity gasolineQuantity, Memo memo, OilingQuantity oilingQuantity) {
		super();
		this.oilingId = oilingId;
		this.carId = carId;
		this.oilingDate = oilingDate;
		this.gasolinePrice = gasolinePrice;
		this.gasolineQuantity = gasolineQuantity;
		this.oilingQuantity = oilingQuantity;
		this.memo = memo;
	}

	public OilingId getOilingId() {
		return oilingId;
	}

	public CarId getCarId() {
		return carId;
	}

	public LocalDate getOilingDate() {
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

	public void setOilingId(OilingId oilingId) {
		this.oilingId = oilingId;
	}

	public void setCarId(CarId carId) {
		this.carId = carId;
	}

	public void setOilingDate(LocalDate oilingDate) {
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

	@Override
	public String toString() {
		return String.format(
				"Oiling [oilingId=%s, carId=%s, oilingDate=%s, gasolinePrice=%s, gasolineQuantity=%s, oilingQuantity=%s, memo=%s]",
				oilingId, carId, oilingDate, gasolinePrice, gasolineQuantity, oilingQuantity, memo);
	}


}
