package ab55;

import java.util.Date;

public class Dateclassprogram2 {

	public static void main(String[] args) {
		
		// create an object of date class
		 
		Date d1=new Date();
		
		System.out.println(d1.getTime());// system understandable time
		
		Date d2=new Date(d1.getTime()+(1000*60*60*24*5));
		
		System.out.println(d2);//human understandable time
		
		String format1 = d2.toString();//convert the date into string.we are doing this to apple string function
		System.out.println(format1.length());
		
		String date = format1.substring(8,10);
		
		System.out.println(date);
		
		String month = format1.substring(4,7);
		System.out.println(month);
		
		String year = format1.substring(format1.length()-4);
		System.out.println(year);
		
		
	    String format2 = 	date.concat(month).concat(year);
		System.out.println(format2);
		
		
		String format3=date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format3);
		
		String format4= date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format4);

	}

}
