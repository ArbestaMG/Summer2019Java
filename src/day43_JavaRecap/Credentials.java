package day43_JavaRecap;

public class Credentials {
/*
 private access modifier is seen by throug public getter/setter
 
 private: only visible(accessible) within the class
 
 getter: instance method, returns the private instance variable.
- Return type must match with the data type of 
 the instance variable
-Acces modifier needs to be public, because we want to call method outside of the methods
 */
	
	private String username="Ibo";
	private String password="12345";


	//getter
	public String getusername() {
		
		return username;
	}
	public String getpassword() {
		return password;
	}
	
	//setter
	
	public void setusername(String str) {
		this.username=str;
		System.out.println(username);
	}
	
	public void setpassword(String password) {
		this.password=password;
		System.out.println(password);
	}
}
