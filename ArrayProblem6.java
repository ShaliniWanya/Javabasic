package ab55;
import java.util.Arrays;

public class ArrayProblem6 {

	public static void main(String[] args) {
		
	//WAP to check if two arrays are equal	
         
		
		int[] array1 = new int[3];
		
		array1[0] = 74;
		array1[1] = 85;
		array1[2] = 12;
		
		int[] array2=new int[3];
		 for (int i=0;i<array1.length;i++)
		 {
			 array2[i]=array1[i];
		 }
		System.out.println("This is first array" + Arrays.toString(array1));
		System.out.println("This is second array" + Arrays.toString(array2));
		 

		boolean b1 = Arrays.equals(array1, array2);
		System.out.println(b1 + " both arrays are equal");
	}

}
