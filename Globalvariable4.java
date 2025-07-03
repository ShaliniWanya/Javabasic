package ab55;

public class Globalvariable4 {
	
	static int a = 100;//static global variable // father's pocket money
	static int b= 200;//global variable
	static double pivalue=Math.PI;
	static double weight;

	public static void main(String[] args) {
		
		 a=400;// printing global static variable
		 System.out.println(a);
		 System.out.println(Globalvariable4.a);
		
		// calling static local variable
		 int a = 245;
		 
		 System.out.println(a);
		
		
		
		

	}

}
