package jp.genuine.training.carmanager.service.carsummarylist;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.genuine.training.carmanager.model.car.summary.CarSummaryList;
import jp.genuine.training.carmanager.model.car.summary.CarSummaryRepository;
import jp.genuine.training.carmanager.model.user.LoginUser;

@Service
public class CarSummaryListServiceImpl implements CarSummaryListService{

	@Autowired
	private CarSummaryRepository carSummaryRepository;

	@Override
	public CarSummaryList listOf(LoginUser loginUser) {
		CarSummaryList carSummaryList = carSummaryRepository.listOf(loginUser.getUser());
		return carSummaryList;
	}

}