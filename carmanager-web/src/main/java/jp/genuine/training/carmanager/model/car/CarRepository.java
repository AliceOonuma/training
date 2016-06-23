package jp.genuine.training.carmanager.model.car;

import java.util.Optional;

public interface CarRepository {

	public Optional<Car> findBy(CarId carId);

}
