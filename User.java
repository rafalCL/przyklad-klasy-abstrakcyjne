package a_Zadania.b_Dzien_2.a_Klasy_abstrakcyjne.zad3;

public abstract class User {
	private String username;
	protected String password;
	protected int age;
	private int consecutiveFailedLoginAttempts = 0;

	public abstract boolean checkLogin(String userName, String password);

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public abstract boolean setPassword(String password);

	public int getAge() {
		return age;
	}

	public abstract boolean setAge(int age);
	
	public final boolean login(String userName, String password) {
		if(this.consecutiveFailedLoginAttempts > 2) {
			return false;
		} else {
			final boolean isOk =  checkLogin(userName, password);
			if(isOk) {
				this.consecutiveFailedLoginAttempts = 0;
				return true;
			} else {
				this.consecutiveFailedLoginAttempts++;
				return false;
			}
		}
	}

}
