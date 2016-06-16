package jp.genuine.training.carmanager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import jp.genuine.training.carmanager.datasource.CoreDataSourceTestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    CoreDataSourceTestSuite.class
})
public class CarmanagerSpockAllTestSuite
{
}
