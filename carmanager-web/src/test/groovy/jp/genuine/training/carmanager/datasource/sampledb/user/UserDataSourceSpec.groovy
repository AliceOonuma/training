package jp.genuine.training.carmanager.datasource.sampledb.user

import javax.sql.DataSource

import jp.genuine.test.util.LogbackHelper
import jp.genuine.training.carmanager.TestConfig
import jp.genuine.training.carmanager.model.user.AccountName

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

public class UserDataSourceSpec extends Specification{
	@Autowired
	UserDataSource userDataSource;

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
	def "<#TEST_NAME>find:データの取得->#TITLE"(){
		given:
			def accountName = new AccountName( ACCOUNT_NAME )
		when:
			def resultUser = userDataSource.findBy( accountName )

		then:
			def user = resultUser.get()
			user.userId.value == USER_ID
			user.password.value == PASSWORD
			user.accountName.value == ACCOUNT_NAME
			user.name.value == USER_NAME

		where:
			TEST_NAME = this.class.name

			TITLE|USER_ID|PASSWORD|ACCOUNT_NAME|USER_NAME
			"存在するユーザーIDでユーザー情報が取得できること"|2|"pass#1234"|"yamada"|"山田太郎"
	}

}
