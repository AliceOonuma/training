package jp.genuine.training.carmanager.service.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import jp.genuine.training.carmanager.model.user.AccountName;
import jp.genuine.training.carmanager.model.user.LoginUser;
import jp.genuine.training.carmanager.model.user.User;
import jp.genuine.training.carmanager.model.user.UserRepository;

public class CarmanagerUserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException{
		User user = userRepository.findBy(new AccountName(username)).orElse(null);
		return new LoginUser(user);
	}

}
