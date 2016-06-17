package jp.genuine.training.carmanager.model.car;

import jp.genuine.training.carmanager.model.car.summary.CarSummaryList;
import jp.genuine.training.carmanager.model.user.User;

public interface CarRepository {

	public CarSummaryList listOf(User user);

}
