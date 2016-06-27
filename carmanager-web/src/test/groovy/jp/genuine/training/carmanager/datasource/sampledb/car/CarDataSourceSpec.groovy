package jp.genuine.training.carmanager.datasource.sampledb.car

import javax.sql.DataSource

import jp.genuine.test.util.LogbackHelper
import jp.genuine.training.carmanager.TestConfig
import jp.genuine.training.carmanager.model.car.CarId

import org.dbunit.database.DatabaseConnection
import org.dbunit.database.IDatabaseConnection
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.test.ConfigFileApplicationContextInitializer
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration

import spock.lang.Specification
import spock.lang.Unroll

@ActiveProfiles("test")
@ContextConfiguration(classes = TestConfig.class, initializers = ConfigFileApplicationContextInitializer.class)

public class CarDataSourceSpec extends Specification{
	@Autowired
	CarDataSource carDataSource;

	@Autowired
	@Qualifier("sampleDBDataSource")
	DataSource sampleDBDataSource;

	private static IDatabaseConnection connection;

	def setupSpec(){
		LogbackHelper.loggingTestStart( this )
	}

	def setup(){
		LogbackHelper.countTestCase()
		connection = new DatabaseConnection( sampleDBDataSource.connection )
	}

	def cleanup(){
		connection.close()
	}

	def cleanupSpec(){
	   LogbackHelper.loggingTestEnd()
	}

	@Unroll
	def "<#TEST_NAME>find:データの取得"()
	{
		given:
			def carId = new CarId( CAR_ID )

		expect:
			def resultCar = carDataSource.findBy( carId )
			resultCar.carId.value == CAR_ID
			resultCar.carName.value == CAR_NAME
			resultCar.gasolineTankCapacity.value == GASOLINETANK_CAPACITY
			resultCar.gasolineType.value == GASOLINE_TYPE
			resultCar.memo.value == MEMO


		where:
			TEST_NAME = this.class.name

			CAR_ID|CAR_NAME|GASOLINETANK_CAPACITY|GASOLINE_TYPE|MEMO
			3|"car2"|50|"レギュラー"|""

	}

	@Unroll
	def "<#TEST_NAME2>find:データの取得"()
	{

		expect:
			def resultCarId = carDataSource.nextId()
			resultCarId.value != null
		where:
			TEST_NAME2 = this.class.name

	}


}
