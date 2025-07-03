package ab55;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args)
	{
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(451145, "Arvind");
		m1.put(451745, "Zia");
		m1.put(451254, "Jivesh");
		m1.put(457800, "Mohit");
		m1.put(453675, "Prashant");
		
		System.out.println(m1);
		
		Map<Integer,String> m2=new HashMap<Integer,String>();
		
		m2.put(496485, "Apeksha");
		
		System.out.println(m2);
		
		m2.putAll(m1);
		System.out.println(m2);
		
		boolean b1 = m1.equals(m2);
		System.out.println(b1);
		
		m1.putIfAbsent(968578, "Arvind"); //banking application
		System.out.println(m1); 
		
		System.out.println(m1.containsKey(478412));
		
		System.out.println(m1.containsValue("Prashant"));
		
		m1.remove(968578);
		System.out.println(m1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
