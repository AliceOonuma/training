package jp.genuine.training.carmanager.datasource.sampledb.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.genuine.training.carmanager.model.car.CarRepository;
import jp.genuine.training.carmanager.model.car.summary.CarSummary;
import jp.genuine.training.carmanager.model.car.summary.CarSummaryList;
import jp.genuine.training.carmanager.model.user.User;

@Repository
public class CarDataSource implements CarRepository{

	@Autowired
	private CarMapper carmapper;

	@Override
	public CarSummaryList listOf(User user) {
		List<CarSummary> carSummaryList = carmapper.listOf(user);
		return new CarSummaryList( carSummaryList );
	}

}
