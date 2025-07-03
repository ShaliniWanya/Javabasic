package ab55;
abstract class Google_auth//abstract class
//100% abstraction
{
	abstract void login();// abstract method
	abstract void logout();// abstract method
	
}

public class ClassType_Concrete extends Google_auth // concrete class
{

	public static void main(String[] args) //concrete method
	{
		
		}

   void login() {
	   System.out.println("real Logic");
	   
	}
	
   void logout() {
	
	   System.out.println("real Logic");
	}

}
