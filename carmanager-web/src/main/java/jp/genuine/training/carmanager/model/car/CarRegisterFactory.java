package jp.genuine.training.carmanager.model.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarRegisterFactory {

	@Autowired
	private CarRepository carRepository;

	public CarRegister create(){
		CarId carid = carRepository.nextId();
		CarRegister carRegister = new CarRegister(carid);
		return carRegister;
	}

}
