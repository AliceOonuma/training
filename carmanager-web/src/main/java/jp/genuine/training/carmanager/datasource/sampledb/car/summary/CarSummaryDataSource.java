package jp.genuine.training.carmanager.datasource.sampledb.car.summary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.genuine.training.carmanager.model.car.summary.CarSummary;
import jp.genuine.training.carmanager.model.car.summary.CarSummaryList;
import jp.genuine.training.carmanager.model.car.summary.CarSummaryRepository;
import jp.genuine.training.carmanager.model.user.User;

@Repository
public class CarSummaryDataSource implements CarSummaryRepository{

	@Autowired
	private CarSummaryMapper carmapper;

	@Override
	public CarSummaryList listOf(User user) {
		List<CarSummary> carSummaryList = carmapper.listOf(user);
		return new CarSummaryList( carSummaryList );
	}



}
