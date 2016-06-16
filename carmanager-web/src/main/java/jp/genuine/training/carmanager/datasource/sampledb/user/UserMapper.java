package jp.genuine.training.carmanager.datasource.sampledb.user;

import org.apache.ibatis.annotations.Param;

import jp.genuine.training.carmanager.model.user.AccountName;
import jp.genuine.training.carmanager.model.user.User;

public interface UserMapper {

	User findBy(@Param("accountName") AccountName accountName);

}
