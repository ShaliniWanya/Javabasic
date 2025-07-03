package ab55;

public class StringFunctionReverse {

	public static void main(String[] args) {
		//Reverse a string
		
		String input="auto";
		String output="";//empty string since we don't know what will be the output.expected output = otua
		
		//come back to front
		// wrong method 2
		        /*char c1=input.charAt(3);
				char c2=input.charAt(2);
				char c3=input.charAt(1);
			    char c4=input.charAt(0);
			    
			    System.out.print(c1);
			    System.out.print(c2);
			    System.out.print(c3);
			    System.out.print(c4);
			    */
		
		// wrong method 2
		/*for (int i =3;i>=0;i--)
		{
			
			char c1=input.charAt(i);
            System.out.print(c1);
			
			
		}*/
			    
		for (int i =input.length()-1;i>=0;i--)	    
		{
			char c1=input.charAt(i);
			output=output+c1;// or we can write output.concat c1
			//output=output.concat(c1);
			}
		System.out.println("This is my input-> "+ input);
		System.out.println("This is my output-> "+ output);
		/*i=3,c1=o,output=o
		  i=2,c1=t,output=o+t=ot
		  i=1,c1=u,output=o+t+u=otu
		  i=0,c1=a,output=o+t+u+a=otua	    
		 */
			    
			    
	}

}
