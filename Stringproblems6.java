package ab55;

import java.util.Arrays;

public class Stringproblems6 {

	public static void main(String[] args) {
	
		String a ="My name is Ram";
		String[] output= a.split(" ");
		System.out.println(Arrays.toString(output));
		
		String a1 ="My name is Ram";
		String[] output1= a.split("a");
		System.out.println(Arrays.toString(output1));
		
		String a2 ="My name is Ram";
		String[] output2= a.split(" ",2);//split with limit like split in two arrays
		System.out.println(Arrays.toString(output2));
		
		String a3 ="My name is Ram";
		String[] output3= a.split(" ",3);//split with limit like split in three arrays
		System.out.println(Arrays.toString(output3));
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}


}






