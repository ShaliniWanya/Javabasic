package ab55;

import java.util.Date;

public class Dateclassprogram1 {

	public static void main(String[] args) {
		
		Date d1=new Date();
		
		System.out.println(d1.getTime());//system understandable time(epoch time)
		
		Date d2=new Date(d1.getTime());
		
		System.out.println(d2);//human understandable time
		
		       String format1=  d2.toString();//convert the date  to string and store it 
		   
		      System.out.println(format1.length()); 
		       
		    String date = format1.substring(8,10);
		    System.out.println(date);
		    String month = format1.substring(4,7);
		    System.out.println(month);
		   // String year = format1.substring(24,28);
		    String year1 = format1.substring(format1.length()-4);
		    System.out.println(year1);
		
		
		String format2=date.concat(month).concat(year1);
		System.out.println(format2);
		
		String format3=date.concat("-").concat(month).concat("-").concat(year1);
		System.out.println(format3);
		
		String format4=date.concat("/").concat(month).concat("/").concat(year1);
		System.out.println(format4);
		
        String time=format1.substring(11,19);
        System.out.println(time);
        
        String hour=format1.substring(11,13);
        System.out.println(hour);
        
        String minute=format1.substring(14,16);
        System.out.println(minute);
        
        String second=format1.substring(17,19);
        System.out.println(second);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
