package jp.genuine.training.carmanager.model.car;

import java.util.Optional;

import jp.genuine.training.carmanager.model.user.User;

public interface CarRepository {

	public Optional<Car> findBy(CarId carId);

	public CarId nextId();

	public void register(CarRegister carRegister,User user);


}
