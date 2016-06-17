package jp.genuine.training.carmanager.datasource.sampledb.car.summary;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jp.genuine.training.carmanager.model.car.summary.CarSummary;
import jp.genuine.training.carmanager.model.user.User;

public interface CarSummaryMapper {

	List<CarSummary> listOf(@Param("user") User user);

}
