package jp.genuine.training.carmanager.model.car.summary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CarSummaryList implements Serializable{

	private List<CarSummary> list;

	public CarSummaryList() {
		list = new ArrayList<CarSummary>();
	}

	public CarSummaryList(List<CarSummary> list) {
		super();
		this.list = list;
	}

	public List<CarSummary> getList() {
		return list;
	}

	public void setList(List<CarSummary> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return String.format("CarSummaryList [list=%s]", list);
	}

	private static final long serialVersionUID = -8086179119010752298L;
}
