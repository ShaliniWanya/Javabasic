package ab55;

import java.util.Scanner;

public class HumanInputAtRunTime {

	public static void main(String[] args) {
		
		// create an object of scanner class
		//Invoking constructor of scanner class(parameterized constructor)
		{
		Scanner s1=new Scanner(System.in);//takes the input from user
		
		// System.out.println();//gives the output in console
		
		 String name =  s1.next();
		 int age= s1.nextInt();
		 boolean answer = s1.nextBoolean();
		    byte s2=  s1.nextByte();
		     short s3=  s1.nextShort();
		       long s4=     s1.nextLong();
		
		        float s5=      s1.nextFloat();
		           double d1=       s1.nextDouble();
		
		      s1.close();
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
