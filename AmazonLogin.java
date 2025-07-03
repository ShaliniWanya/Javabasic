package ab55;

 class AmazonLogin {

	  AmazonLogin(long mobileno)//this is contructor
	{
		System.out.println("Login using mobile no.");
	
	}
	  AmazonLogin(String emailid)//this is contructor
	  {
		System.out.println("Login using email id");  
	  
	  }
	
	public static void main(String[] args) {
	
		// By creating an object,we can call constructor directly
      //AmazonLogin al = new AmazonLogin();
         //al.AmazonLogin();//we dont need to do this..since we do this when calling non static method
		
		//another way to create an object
     /* new AmazonLogin();
      new AmazonLogin();
      new AmazonLogin();
      new AmazonLogin();
		*/
		
		//AmazonLogin a1 = new AmazonLogin(1234567890l);
		
		//AmazonLogin a2 = new AmazonLogin("manish@grotechminds.com");
		
		
		 new AmazonLogin(1234567890l);
	      new AmazonLogin("manish@grotechminds.com");
			
		
		
		
		
		
		
		
		
		
		
	}

}
