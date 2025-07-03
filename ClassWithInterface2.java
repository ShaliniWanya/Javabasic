package ab55;
interface Three
{
	void add();// by deafult it is public and default // abstract methods
    void sub(); // abstract methods
	}
interface Two extends Three
{
	void mul(); // abstract methods
    void div(); // abstract methods
	
}

public class ClassWithInterface2 implements Two
{
	static void mod()
	{
		System.out.println("Concrete method");
		
	}

	public static void main(String[] args) {
		

	}


	public void add() {
		
		
	}

	
	public void sub() {
		
		
	}

	
	public void mul() {
		
		
	}


	public void div() {
		
		
	}

	
	
}
