package ab55;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		try 
		{
		int array1[] = new int[s1.nextInt()];
		
		}
		catch(InputMismatchException c1)
		{
			System.out.println("Handled the exception 1");
			
		}

		catch(NegativeArraySizeException c2)
		{
			
			System.out.println("Handled the exception 2");
		}
		
		
		
		
	}

}
