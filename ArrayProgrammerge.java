package ab55;

import java.util.Arrays;

public class ArrayProgrammerge {

	public static void main(String[] args) {
	 
		int[] array1=new int[3];
		
		array1[0]=11;
		array1[1]=22;
		array1[2]=33;
		
		int[] array2=new int[3];

		array2[0]=66;
		array2[1]=77;
		array2 bkonlyu; h                     j j gj oiiojrpl8bop[2]=55;
		
		int[] array12=new int[array1.length+array2.length];//size merge
		
		for(int i=0;i<array1.length;i++)
		{
			array12[i]=array1[i];
		}
		
		for (int j=0;j<array2.length;j++)
		{
			array12[array1.length+j]=array2[j];
		}
		System.out.println("This merged array is -> " );
		System.out.println((Arrays.toString(array12)));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
