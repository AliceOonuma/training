package jp.genuine.training.carmanager.service.car;

import java.util.List;

import jp.genuine.training.carmanager.model.car.CarId;
import jp.genuine.training.carmanager.model.car.CarRegister;
import jp.genuine.training.carmanager.model.car.GasolineType;
import jp.genuine.training.carmanager.model.user.User;

public interface CarModifyService {

	public CarRegister findByDetail(CarId carId);

	public void modify(CarRegister carRegister,User user);

	public List<GasolineType> type();

}
