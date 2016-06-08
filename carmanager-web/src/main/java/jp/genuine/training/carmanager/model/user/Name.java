package jp.genuine.training.carmanager.model.user;

public class Name {

	private String value;

	public Name() {
		value = "";
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Name(String value) {
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
		return String.format("Name [value=%s]", value);
	}

}
