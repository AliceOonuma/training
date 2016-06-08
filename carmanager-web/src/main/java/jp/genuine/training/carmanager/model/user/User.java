package jp.genuine.training.carmanager.model.user;

public class User {

	private UserId userId;
	private Password password;
	private AccountName accountName;
	private Name name;

	public User() {
		userId = new UserId();
		password = new Password();
		accountName = new AccountName();
		name = new Name();
	}

	public User(UserId userId, Password password, AccountName accountName, Name name) {
		super();
		this.userId = userId;
		this.password = password;
		this.accountName = accountName;
		this.name = name;
	}

	public UserId getUserId() {
		return userId;
	}

	public Password getPassword() {
		return password;
	}

	public AccountName getAccountName() {
		return accountName;
	}

	public Name getName() {
		return name;
	}

	public void setUserId(UserId userId) {
		this.userId = userId;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	public void setAccountName(AccountName accountName) {
		this.accountName = accountName;
	}

	public void setName(Name name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("User [userId=%s, password=%s, accountName=%s, name=%s]", userId, password, accountName,
				name);
	}


}
