package ab55;

public class StringFunctions {

	public static void main(String[] args) {
		
		String a= "automation";
		
	   int size = 	a.length();
	   System.out.println(size);
	   
	  String uppername  = a.toUpperCase();
	  System.out.println(uppername);
	  
	  String b="Manish Kumar Tiwari";
	  String lowercase= b.toLowerCase();
      System.out.println(lowercase);
	  
     boolean b1= b.equals("1");
     System.out.println(b1);
	  
     boolean b2= b.equals("MANISH");
	  System.out.println(b2);
	  
	 boolean b3= b.equals("MANISH KUMAR TIWARI");
	  System.out.println(b2);
	  
	 boolean b4= b.equals("Manish Kumar Tiwari");
	  System.out.println(b4);
	  
	boolean  b5= b.equalsIgnoreCase("MANISH KUMAR TIWARI");
	  System.out.println(b5);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
