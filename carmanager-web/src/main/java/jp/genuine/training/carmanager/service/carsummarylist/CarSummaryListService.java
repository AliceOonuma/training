package jp.genuine.training.carmanager.service.carsummarylist;

import jp.genuine.training.carmanager.model.car.summary.CarSummaryList;
import jp.genuine.training.carmanager.model.user.LoginUser;

public interface CarSummaryListService {

	public CarSummaryList listOf(LoginUser loginUser);

}
