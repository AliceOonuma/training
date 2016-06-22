package jp.genuine.training.carmanager.model.car;

public interface CarRepository {

	public Car findBy(CarId carId);

}
