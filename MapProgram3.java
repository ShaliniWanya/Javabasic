package ab55;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapProgram3 {

	public static void main(String[] args) {
	
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(451145, "Arvind");
		m1.put(451745, "Zia");
		m1.put(451254, "Jivesh");
		m1.put(457800, "Mohit");
		m1.put(453675, "Prashant");
		
		System.out.println(m1);
		System.out.println("Iterating through keys using KeySet():");
		
	//Set<Integer> s2= m1.keySet();
	
	for ( Integer i1  :m1.keySet())
	{
		
		System.out.println(i1);
	}
	
	System.out.println("Iterating through Values using values():");
	for( String s2   :m1.values() )
	{
		
		System.out.println(s2);
		
	}
	System.out.println("Iterating through key and value  using EntrySet():");
	for(   Entry<Integer,String> e2   :m1.entrySet())
	{
		
		System.out.println(e2);
		
	}
	
	System.out.println("Iterating using Iterator:");
	
	
	Set<Entry<Integer,String>> s12 = m1.entrySet();
	
	 Iterator<Entry<Integer,String>> s3=    s12.iterator();
	
	while (s3.hasNext()) 
	{
		
		System.out.println(s3.next());
		
	}
	
	
	

	}

}
