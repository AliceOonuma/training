package jp.genuine.training.carmanager.model.car.summary;

import jp.genuine.training.carmanager.model.user.User;

public interface CarSummaryRepository {

	public CarSummaryList listOf(User user);

}
