package ab55;

public class NonStaticMethod {
	
	void login()//no access specifier as of now
	{
		System.out.println("Login to amazon");
		
	}
	void logout()
	{
		
		System.out.println("Logout from amazon");
		
	}

	public static void main(String[] args) {
		// create an object to call non static method
		NonStaticMethod nl = new NonStaticMethod();
		 //nl.login();
		 //nl.logout();
				

	}

}
