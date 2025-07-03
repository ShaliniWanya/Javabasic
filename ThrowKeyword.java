package ab55;

public class ThrowKeyword {

	public static void main(String[] args) throws NullPointerException
	{
		
		/*String a="";
		
		System.out.println(a.charAt(4));
		
		*/
	
		if(1==1)
		{
			throw new NullPointerException("String is empty");
			
		}
		else
		{
		throw new StringIndexOutBoundsException("String index outr of range: 4");
		}
		
		
		
		
		
		
		
		

	}

}
