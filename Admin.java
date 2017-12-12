package a_Zadania.b_Dzien_2.a_Klasy_abstrakcyjne.zad3;

public class Admin extends User {
	private String ip;

	@Override
	public boolean checkLogin(String userName, String password) {
		if (this.getUsername() != null && this.getUsername().equals(userName)
		 && this.getPassword() != null && this.getPassword().equals(password)
		 && this.getIp() != null) {
			return true;
		}

		return false;
	}

	@Override
	public boolean setPassword(String password) {
		if (password.length() > 9) {
			this.password = password;
			return true;
		}

		return false;
	}

	@Override
	public boolean setAge(int age) {
		if (age > 17) {
			this.age = age;
			return true;
		}

		return false;
	}

	public String getIp() {
		return ip;
	}

	public boolean setIp(String ip) {
		if (ip != null
		 && (ip.startsWith("192") || ip.startsWith("127"))) {
			this.ip = ip;
			return true;
		}

		this.ip = null;
		return false;
	}
}
