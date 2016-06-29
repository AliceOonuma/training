package jp.genuine.training.carmanager.model.car;

import java.util.List;
import java.util.Optional;

import jp.genuine.training.carmanager.model.user.User;

public interface CarRepository {

	public Optional<Car> findBy(CarId carId);

	public CarId nextId();

	public void register(CarRegister carRegister,User user);

	public CarRegister findByDetail(CarId carId);

	public void modify(CarRegister carRegister,User user);

	public List<GasolineType> type();
}
