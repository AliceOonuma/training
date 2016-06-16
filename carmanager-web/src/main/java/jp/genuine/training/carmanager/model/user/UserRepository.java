package jp.genuine.training.carmanager.model.user;

import java.util.Optional;

public interface UserRepository {

	public Optional<User>findBy(AccountName accountName);

}
