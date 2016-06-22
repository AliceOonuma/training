package jp.genuine.training.carmanager.datasource.sampledb.car;

import org.apache.ibatis.annotations.Param;

import jp.genuine.training.carmanager.model.car.Car;
import jp.genuine.training.carmanager.model.car.CarId;

public interface CarMapper {

	Car findBy(@Param("carId") CarId carId);

}
