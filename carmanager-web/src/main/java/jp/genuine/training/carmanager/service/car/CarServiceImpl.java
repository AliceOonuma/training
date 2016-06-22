package jp.genuine.training.carmanager.service.car;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.genuine.training.carmanager.model.car.Car;
import jp.genuine.training.carmanager.model.car.CarId;
import jp.genuine.training.carmanager.model.car.CarRepository;



@Service
public class CarServiceImpl implements CarService{

	@Autowired
	private CarRepository carRepository;

	@Override
	public Car findBy(CarId carId) {
		Car car = carRepository.findBy(carId);
		return car;
	}



}