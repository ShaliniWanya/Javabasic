package ab55;

import java.util.Scanner;

public class HumanInputAtRunTime2 {
	
	
	
	static void area_of_circle()
	{
		System.out.println("Enter the value of R");
		
		Scanner s1=new Scanner(System.in);
		double r = s1.nextDouble();
		System.out.println("Lets find out the AREA");
		double area=Math.PI*r*r;
		System.out.println("Area of Circle is : " + area);
		s1.close();
		
	}
	
	public static void main(String[] args) {
		area_of_circle();
		
		
		
		
	}

}
