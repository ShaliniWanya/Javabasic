package ab55;

public class MethodOverloading {
	
	int a;
	static void add(int a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
		
		}
    static void add(int a,double b,int c)
	{
		double sum=a+b+c;
		System.out.println(sum);
		
	}
	static void add(double a,int b)
	{
		double sum=a+b;
		System.out.println(sum);
		
		}
	 void add(double a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
		
		}
	 void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
      add(100,3.14);
     // add();//non static method ...create an object
      add(4,3.14,5);
      add(3.14,9);
      //add();
      MethodOverloading m1=new MethodOverloading();
      m1.add(100, 250);
      
		
		
		
	}

}
