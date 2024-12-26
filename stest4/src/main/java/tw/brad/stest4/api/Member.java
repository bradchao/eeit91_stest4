package tw.brad.stest4.api;

public class Member {
	private int id;
	private String account;
	private int age;
	
	public Member() {}
	public Member(String account, int age) {
		this.account = account; this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
