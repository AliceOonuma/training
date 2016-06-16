package jp.genuine.training.carmanager.datasource.sampledb.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.genuine.training.carmanager.model.user.AccountName;
import jp.genuine.training.carmanager.model.user.User;
import jp.genuine.training.carmanager.model.user.UserRepository;

@Repository
public class UserDataSource implements UserRepository{

	@Autowired
	private UserMapper mapper;

	@Override
	public Optional<User> findBy(AccountName accountName){
		User user = mapper.findBy(accountName);
		return Optional.ofNullable(user);
	}

}
