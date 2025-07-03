package ab55;

import java.util.Arrays;

public class ArrayProblem4 {

	public static void main(String[] args) {
		
		// WAP to copy the value of one array into another array.
		
		/*int[] array1=new int[3];
		
		array1[0] = 74;
		array1[1] = 85;
		array1[2] = 12;
		
		int[] array2=new int[3];
		
		array2[0] = array1[0]; 
		array2[1] = array1[1]; 
		array2[2] = array1[2]; 
		
		System.out.println("This is my 1st Array"+Arrays.toString(array2));
		
		System.out.println("This is my copied Array"+Arrays.toString(array2));*/
		
		// WAP to copy the value of one array into another array using for loop
		
		int[] array1 = new int[3];
		
		array1[0] = 74;
		array1[1] = 85;
		array1[2] = 12;
		
		int[] array2=new int[3];
		 for (int i=0;i<array1.length;i++)
		 {
		array2[i] = array1[i];
		 }
		System.out.println("This is original array" + Arrays.toString(array1));
		System.out.println("This is reversed array" + Arrays.toString(array2));
		 
		
		
		
		
		
	}

}
