package jp.genuine.training.carmanager.datasource.sampledb.car;

import org.apache.ibatis.annotations.Param;

import jp.genuine.training.carmanager.model.car.Car;
import jp.genuine.training.carmanager.model.car.CarId;
import jp.genuine.training.carmanager.model.car.CarRegister;
import jp.genuine.training.carmanager.model.user.User;

public interface CarMapper {

	Car findBy(@Param("carId") CarId carId);

	CarId nextId();

	void register(@Param("carRegister") CarRegister carRegister,@Param("user") User user);

	void registerInitialStatus(@Param("carRegister") CarRegister carRegister);

}
