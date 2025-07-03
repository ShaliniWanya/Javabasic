package ab55;

import java.util.Arrays;

public class ArrayProblem7 {

	public static void main(String[] args) {
		
		String a1="heart";//sunita
		String a2="earth";//"manish
		
		if (a1.length()!=a2.length())
		
		{System.out.println("Since length of the 2 strings are not same they can never be anagram");
		
		}

		else 
		{
			//[h,e,a,r,t] sort it [a,e,h,r,t]
			//[e,a,r,t,h] sort it [a,e,h,r,t]
			
			// converting array to char
			
			char []c1 = a1.toCharArray();
			char []c2 = a2.toCharArray();	
					
				Arrays.sort(c1);
					
				Arrays.sort(c2);	
				
				System.out.println(Arrays.toString(c1));
				System.out.println(Arrays.toString(c2));
				
				if (Arrays.equals(c1, c2)==true)
				{
				System.out.println("Anagram");	
				}
				else 
				{System.out.println("Not an anagram");
					
					
				}
					
		}
		
		
		
		
		
		
		
		
		
		
		
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
