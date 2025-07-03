package ab55;

public class Arrayproblem1 {

	public static void main(String[] args) {
		 
		int[] rollno=new int[3];
		
		rollno[0] = 74;
		rollno[1] = 85;
		rollno[2] = 12;
		
		/*System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);*/
		
		// Avoid using above approach ,instead use for loop because for 5-6 numbers it is ok what if 100 inputs are there
		
		for (int i=0;i<=2;i++)
		{
		System.out.println(rollno[i]) ;	
			
		}
		
		String [] name= new String[3];
		name[0]= "Shalini";
		name[1]="Rudra";
		name[2]="Vaishali";
		
		for (int i=0;i<=2;i++)
		{
			System.out.println(name[i]);
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
