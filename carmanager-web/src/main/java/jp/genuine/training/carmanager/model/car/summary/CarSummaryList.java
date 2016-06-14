package jp.genuine.training.carmanager.model.car.summary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CarSummaryList implements Serializable{

	private List<CarSummary> list;

	public CarSummaryList() {
		list = new ArrayList<CarSummary>();
	}

	public CarSummaryList(List<CarSummary> carSummaryList) {
		super();
		this.list = carSummaryList;
	}

	public List<CarSummary> getValue() {
		return list;
	}

	public void setValue(List<CarSummary> carSummaryList) {
		this.list = carSummaryList;
	}

	@Override
	public String toString() {
		return String.format("CarSummaryList [list=%s]", list);
	}

	private static final long serialVersionUID = -8086179119010752298L;
}
