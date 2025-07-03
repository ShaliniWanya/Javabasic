package ab55;
import java.util.Arrays;

public class Arrayproblem8
{

	public static void main(String[] args) 
	{
		 
		String input="k v no 2";//"zoo in a 123 &$%"
		 // no of alphabet present = 4,spaces present=3,numeric present=1,spacial char present=0
		
	    int countofalpha=0;
	    //int countofnumeric=0;
		
	    char[] c1=	input.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		// in java byte ,short,int,long,float,double,char,boolean are data types also keywords
		// All above have class in java called wrapper class.like Integer class,Float class,Boolean class 
		
		
		for (int i=0;i<c1.length;i++)
		{
		
			boolean b1=Character.isAlphabetic(c1[i]);
		  //boolean   b2=Character.isDigit(c1[i)
			//boolean b3=Character.Whitespace(c1[i]);
			          
			if (b1==true)
		
		{
			countofalpha++;
		
			}
			//if(b2==true)
			//{
		   // countofnumeric++;
				
			}
		//if (b3==true)
		System.out.println("Count of alphabets in the given string is -> " +countofalpha);
	 
		System.out.println("Count of spaces in the given string is -> " +countofalpha);
		
		System.out.println("Count of special char  in the given string is -> " +countofalpha);
		
		System.out.println("Count of numeric  in the given string is -> " +countofalpha);
		
		
		
		

	}


	}

