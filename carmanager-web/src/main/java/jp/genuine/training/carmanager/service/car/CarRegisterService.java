package jp.genuine.training.carmanager.service.car;

import jp.genuine.training.carmanager.model.car.CarRegister;
import jp.genuine.training.carmanager.model.user.User;

public interface CarRegisterService {

	public void register(CarRegister carRegister,User user);

}
