package ab55;

public class Pallindromeproblem {

	public static void main(String[] args) {
		
		String input="student";//kayak//radar
		String output="";
		
		for (int i = input.length()-1;i>=0;i--)
		{
			
			char c1= input.charAt(i);
			output=output+c1;
			}
		System.out.println("Here is my input-> " +input);
		System.out.println("Here is my output-> " +output);
		
		if(input.equals(output))
		
		{
			System.out.println("It is a pallindrome");
		}
		else 
		{
			System.out.println("It is not a pallindrome");
		}
		
		
		
		
		
		
		
	}

}
