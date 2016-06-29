package jp.genuine.training.carmanager.service.car;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.genuine.training.carmanager.model.car.CarId;
import jp.genuine.training.carmanager.model.car.CarRegister;
import jp.genuine.training.carmanager.model.car.CarRepository;
import jp.genuine.training.carmanager.model.car.GasolineType;
import jp.genuine.training.carmanager.model.user.User;

@Service
public class CarModifyServiceImpl implements CarModifyService{

	@Autowired
	private CarRepository carRepository;

	@Override
	public CarRegister findByDetail(CarId carId) {
		CarRegister carRegister = carRepository.findByDetail(carId);
		return carRegister;
	}

	@Override
	public void modify(CarRegister carRegister, User user) {
		carRepository.modify(carRegister, user);

	}

	@Override
	public List<GasolineType> type() {
		List<GasolineType> gasolineType = carRepository.type();
		return gasolineType;
	}

}
