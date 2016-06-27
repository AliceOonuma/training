package jp.genuine.training.carmanager.service.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.genuine.training.carmanager.model.car.CarRegister;
import jp.genuine.training.carmanager.model.car.CarRepository;
import jp.genuine.training.carmanager.model.user.User;

@Service
public class CarRegisterServiceImpl implements CarRegisterService{

	@Autowired
	private CarRepository carRepository;

	@Override
	public void register(CarRegister carRegister,User user) {
		carRepository.register(carRegister, user);
	}

}
