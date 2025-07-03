package ab55;

public class FinalVariable {
	
  final	static double pivalue=Math.PI;
	
	static void area_of_circle()
	{
		//pi*r*r
		//int r=10;
		int r=1;
	double area=pivalue*r*r;
	System.out.println(area);
		
	}
	
	public static void main(String[] args) {
		area_of_circle();
		

	}

}
