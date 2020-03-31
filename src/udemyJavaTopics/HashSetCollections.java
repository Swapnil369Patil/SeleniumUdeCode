package udemyJavaTopics;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollections {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		
		//we can write like below also
		
		//Set<String> set1=new HashSet<String>();
		
		
		//Properties of Set
		//HashSet implements set interface
		 //insertion order is not  preserve i.e, unorderd list  but objects are inserted using hashcode//imp
		//in set duplicate values are not allowed, if added then it will give output as false i.e., it allows only unique values
		//you can add null values,
		//we can add  any data type. i.e., hetrogeneous is possible
		//we can not fetch values using index because it is not preserve insertion order
		//set default intial capacity is 16 and default fill ratio/load factor =0.75% means if default capacity is filled with 0.75% then
		//new hashset object is going to created.
		//if our frequent operation is search then hashset is best choice. cause we can search by hashcode easily

		set.add("Swap");
		set.add("Automation");
		set.add("Selenium");
		set.add("Appium");
		set.add("Swap");
		
		System.out.println(set);
		
		//how to print all values of set
		//1)Using For each loop
	
		for(String var:set) {
			
			System.out.println(var);
		}
		
		//1)Using iterator
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	System.out.println(" ==============================");	
	
	
		//if we want print only specific value then
		
	Iterator<String> itr1=set.iterator();
	
	while(itr1.hasNext()) {
		
		String value=itr1.next();
		if(value.equals("Swap"))
		{
			System.out.println(value);
		}
		
		
		
	}
	
	}

}
