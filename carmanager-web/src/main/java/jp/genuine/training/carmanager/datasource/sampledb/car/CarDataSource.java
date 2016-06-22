package jp.genuine.training.carmanager.datasource.sampledb.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.genuine.training.carmanager.model.car.Car;
import jp.genuine.training.carmanager.model.car.CarId;
import jp.genuine.training.carmanager.model.car.CarRepository;

@Repository
public class CarDataSource implements CarRepository{

	@Autowired
	private CarMapper carMapper;

	@Override
	public Car findBy(CarId carId) {
		Car car = carMapper.findBy(carId);
		return car;
	}







}
