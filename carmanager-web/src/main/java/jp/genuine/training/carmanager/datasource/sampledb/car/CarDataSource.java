package jp.genuine.training.carmanager.datasource.sampledb.car;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.genuine.training.carmanager.model.car.Car;
import jp.genuine.training.carmanager.model.car.CarId;
import jp.genuine.training.carmanager.model.car.CarRegister;
import jp.genuine.training.carmanager.model.car.CarRepository;
import jp.genuine.training.carmanager.model.car.GasolineType;
import jp.genuine.training.carmanager.model.user.User;

@Repository
public class CarDataSource implements CarRepository{

	@Autowired
	private CarMapper carMapper;

	@Override
	public Optional<Car> findBy(CarId carId) {
		Car car = carMapper.findBy(carId);
		return Optional.ofNullable(car);
	}

	@Override
	public CarId nextId() {
		CarId nextCarId = carMapper.nextId();
		return nextCarId;
	}

	@Override
	public void register(CarRegister carRegister,User user) {
		carMapper.register(carRegister,user);
		carMapper.registerInitialStatus(carRegister);
	}

	@Override
	public void modify(CarRegister carRegister,User user) {
		carMapper.modify(carRegister, user);
		carMapper.modifyInitialStatus(carRegister);
	}

	@Override
	public CarRegister findByDetail(CarId carId) {
		CarRegister carRegister = carMapper.findByDetail(carId);
		return carRegister;
	}

	@Override
	public List<GasolineType> type() {
		List<GasolineType> gasolineType = carMapper.type();
		return gasolineType;
	}

}
