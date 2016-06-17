package jp.genuine.training.carmanager.datasource;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import jp.genuine.training.carmanager.datasource.sampledb.car.CarDataSourceSpec;
import jp.genuine.training.carmanager.datasource.sampledb.user.UserDataSourceSpec;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	UserDataSourceSpec.class,
	CarDataSourceSpec.class
})

public class CoreDataSourceTestSuite {

}
