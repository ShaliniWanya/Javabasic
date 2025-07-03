package ab55;

import java.util.HashMap;
import java.util.Map;

public class MapProgram2 {

	public static void main(String[] args) {
		
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(451145, "Arvind");
		m1.put(451745, "Zia");
		m1.put(451254, "Jivesh");
		m1.put(457800, "Mohit");
		m1.put(453675, "Prashant");
		
		System.out.println(m1);
		
		//m1.remove(453675);
		//m1.remove(451254,"Jivesh");
		
		System.out.println(m1);
		
		m1.replace(451745,"Sonam");
		m1.replace(451145, "Arvind", "Yogesh");
		
		//m1.clear();
		
		System.out.println(m1.get(457800));
		
		
		System.out.println(m1);
		
		
		
		
		
		
		

	}

}
