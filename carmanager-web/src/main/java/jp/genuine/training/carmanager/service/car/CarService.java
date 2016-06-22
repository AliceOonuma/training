package jp.genuine.training.carmanager.service.car;

import jp.genuine.training.carmanager.model.car.Car;
import jp.genuine.training.carmanager.model.car.CarId;

public interface CarService {

	public Car findBy(CarId carId);

}
