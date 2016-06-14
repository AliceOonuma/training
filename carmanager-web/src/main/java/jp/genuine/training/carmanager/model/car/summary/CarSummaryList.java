package jp.genuine.training.carmanager.model.car.summary;

import java.util.ArrayList;
import java.util.List;

public class CarSummaryList {

	private List<CarSummary> carSummaryList;

	public CarSummaryList() {
		carSummaryList = new ArrayList<CarSummary>();
	}

	public CarSummaryList(List<CarSummary> carSummaryList) {
		super();
		this.carSummaryList = carSummaryList;
	}

	public List<CarSummary> getValue() {
		return carSummaryList;
	}

	public void setValue(List<CarSummary> carSummaryList) {
		this.carSummaryList = carSummaryList;
	}

	@Override
	public String toString() {
		return String.format("CarSummaryList [carSummaryList=%s]", carSummaryList);
	}


}
