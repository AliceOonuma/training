package jp.genuine.training.carmanager.datasource.sampledb.car.summary

import javax.sql.DataSource

import jp.genuine.test.util.LogbackHelper
import jp.genuine.training.carmanager.TestConfig
import jp.genuine.training.carmanager.model.user.AccountName
import jp.genuine.training.carmanager.model.user.Name
import jp.genuine.training.carmanager.model.user.Password
import jp.genuine.training.carmanager.model.user.User
import jp.genuine.training.carmanager.model.user.UserId

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

public class CarSummaryDataSourceSpec extends Specification{
	@Autowired
	CarSummaryDataSource carDataSource;

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
			def testUser = new User(new UserId( 3 ),new Password( "#5678" ),new AccountName( "suzuki" ),new Name( "鈴木勇太" ))

		expect:
			def resultCarSummaryList = carDataSource.listOf( testUser )
			resultCarSummaryList.list[INDEX].carId.value == CAR_ID
			resultCarSummaryList.list[INDEX].carName.value == CAR_NAME


		where:
			TEST_NAME = this.class.name

			INDEX|USER_ID|CAR_ID|CAR_NAME
			0|3|2|"car1"
			1|3|3|"car2"

	}

}
