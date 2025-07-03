package ab55;

import java.util.Arrays;

public class ArrayProblem5 {

	public static void main(String[] args) {
	 
		// WAP to reverse an array into another array
		
        int[] array1 = new int[4];
		
		array1[0] = 74;
		array1[1] = 85;
		array1[2] = 12;
		array1[3] = 600;
		
		int[] array2 = new int[array1.length];

		for (int i =0,j=3;i<array1.length;i++,j--)
		{
			array2[j] = array1[i];
			
			}
		
        System.out.println("This is my 1st Array"+ Arrays.toString(array1));
		
		System.out.println("This is my copied Array"+Arrays.toString(array2));
		
		
		
		
	}

}
