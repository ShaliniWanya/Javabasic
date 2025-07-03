package ab55;

public class ZStudent {

	public static void main(String[] args) {
		
		ZTeacher a1 =new ZTeacher();//Because teacher is non static 
				a1.add();
		
	  // ZTeacher.add();
				
		ZTeacher.div();
		ZTeacher.mul();

//No sub method is accessed here because sub is a private method so it can not be accessed in different class of same package
		

	}

}
