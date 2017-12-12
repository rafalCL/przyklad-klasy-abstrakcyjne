package a_Zadania.b_Dzien_2.a_Klasy_abstrakcyjne.zad3;

public class Client extends User {

	@Override
	public boolean checkLogin(String userName, String password) {
		if(this.getUsername() != null && this.getUsername().equals(userName)
		&& this.getPassword() != null && this.getPassword().equals(password)) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean setPassword(String password) {
		if(password.length() > 7) {
			this.password = password;
			return true;
		}
		
		return false;
	}

	@Override
	public boolean setAge(int age) {
		if(age > 17) {
			this.age = age;
			return true;
		}
		
		return false;
	}

}
