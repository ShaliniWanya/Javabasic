package ab55;

public class Stringproblem3 {

	public static void main(String[] args) {
	
		String a="Automation 123 Testing 346";
		
		// replace all smaller letters with nothing
		// replace all the capital letters with nothing
        // replace all the numeric letters from the given string
		
		System.out.println(a.replaceAll("[a-z]", ""));
		System.out.println(a.replaceAll("[a-z]", "1"));
		
		System.out.println(a.replaceAll("[A-Z]", ""));
		System.out.println(a.replaceAll("[0-9]", ""));
		
	}

}
