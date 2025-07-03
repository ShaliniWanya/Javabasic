package ab55;

public class FirstProgram {
	
	static void house1()
	{ 
		int b =10000;//local variable 
		System.out.println(b);
	
	}
 
	static  void house2()
	{ 
		
		int b =10000;//local variable 
		System.out.println(b);
	
		
	}
	
	public static void main(String[] args) {
		
		int a=100;//local variable 
		System.out.println(a);
		double salary = 365*1000;// local variable can neither be static nor non static 
		System.out.println(salary);
		

		double weight;
		//System.out.println(weight);// gives error because weight which is a local 
		                            //variable do not give any default 
		                           // value.We need to initialize the value.
	}

}
