package jp.genuine.training.carmanager.model.user;

public class Password {

	private String value;

	public Password() {
		value = "";
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Password(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("Password [value=%s]", value);
	}



}
