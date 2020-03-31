package udemyJavaTopics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapCollection {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<String,String>();
		
		//Properties of HashMap
		//It stores value in key value pair
		//duplicate keys are not allowed it will override previous one
		//it allows one null key only and multiple null values
		//insertion order not fixed
		//hashmap is non synchronised so it is not thread safe. hashmap can be access multiple thread at a time.
		//put method is use for add and get method is use for fetch values in hashmap
		//default intial capacity is 16 and default fill ratio/load factor =0.75% means if default capacity is filled with 0.75% then
	//new hashmap object is going to created. with  following formula 2^4=16--16*0.75=12, 2^5=36--36*0.75=27, 2^6=72--72*0.75=54
		
		map.put("firstname","Swapnil");
		map.put("lastname","Swapnil");
		map.put("Sub","java");
		map.put("State","MH");
		map.put("Country","India");
		
		System.out.println(map);
		
		System.out.println(map.size());
		
		System.out.println(map.get("firstname"));// get accept key value here
		
		//how to print all values in Hashmap
		//1) using keyset
		
		Set<String>keys=map.keySet();
		
		for(String key:keys) {
			
			System.out.println("key is---->"+key+"   value is---->"+map.get(key));
			
		}
		
		System.out.println("================================================");
		//1) using entryset
		Set<Map.Entry<String, String>> values=map.entrySet(); // Entry Is also interface in Map i.e., interface in interface
		
		for(Map.Entry<String, String> e:values)
			
		{
			System.out.println(e.getKey()+"  =  "+e.getValue());
		}
		
		//differant ways of writing map plz see below
		
		Map<String,List<String>> map1=new HashMap<String,List<String>>();//we can add keys in list also
		
		List<String> listofEmails=new ArrayList<String>();
		listofEmails.add("swap@India.com");
		listofEmails.add("swap@MH.com");
		listofEmails.add("swap@pune.com");
		listofEmails.add("swap@wakad.com");
		
		map1.put("email",listofEmails);
	}

}
