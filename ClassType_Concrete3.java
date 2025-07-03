package ab55;
abstract class linkedin_auth
{
	abstract void login();
	abstract void registration();
	static void logout()
	{
		System.out.println("Exposing the logic");
		
	}
	static void reseting_password()
	{
		
		System.out.println("Exposing the logic");
	}
	
	
}
abstract class facebook_auth extends linkedin_auth
{
	abstract void login_mobile();
	abstract void registration_otp();
	
}
public class ClassType_Concrete3 extends facebook_auth
{
	static void method1()
	{
		
	}

	public static void main(String[] args) {
		
		}

	
	void login_mobile() {
	
		
	}


	void registration_otp() {
	
		
	}


	void login() {
		
		
	}


	void registration() {
		
		
	}

}
