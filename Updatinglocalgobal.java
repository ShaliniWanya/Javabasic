package ab55;

public class Updatinglocalgobal {
   //Updating local and global variable value
	
	
	static int a = 100;//static global variable // father's pocket money
	  int b= 500;//non static global variable // father's pocket money
	
	
	
	public static void main(String[] args) {
	     
		Updatinglocalgobal g2 = new Updatinglocalgobal();
		    g2.b=300;// this is how u update the global variable in case it is non static global vartiable 
		     System.out.println(g2.b);
			g2.b=700;//again updating..	
		a=200;
	      System.out.println(a);
		
		int c =90;
	      System.out.println(c);
	      c=60;
	      System.out.println(c);

	}

}
