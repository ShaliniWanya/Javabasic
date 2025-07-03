package ab55;

public class ExceptionTypes {

	public static void main(String[] args) throws InterruptedException
	
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
		    try
		    {
			Thread.sleep(2000);
		    }catch (InterruptedException e)
		    {
		    	
		    	e.printStackTrace();
		    }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
