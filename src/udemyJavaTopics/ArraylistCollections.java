package udemyJavaTopics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistCollections {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		System.out.println(list);
		
		System.out.println(list.size());
	//Properties of list
		//Arraylist implements list interface
   //insertion order preserve, //imp
		//you can add null values,we can add duplicate value, we can add values of any data type,size is not fixed
  //if our frequent operation is Retrival then arraylist is best choice
//if our frequent operation is insertion in midle then arraylist is worst choice. because multiple shift operation required
//if our frequent operation is remove in midle then arraylist is worst choice. because multiple shift operation required
//AL is not synchronised.so AL is not threadsafe. so in arraylist multiple thread are allow to operate at a time.
//performance of system is high coz these threads are not required to wait. all tread are working at a time
//allows random access to fetch the element because  its store the values on the basis of index
		//we can use following methods as well addAll,removeAll,retainAll
		//Arralist Maximum capacity=10 and //New capcity of AL after 10=current capacity*1.5+1 i.e 16 then 25 and so on 
		//
	list.add(10);
	list.add("Swapnil");
	list.add(10.22);
	list.add('c');
	list.add(true);
	list.add(null);
	list.add("Swapnil");
	
	System.out.println(list);
	System.out.println(list.size());
	
	//how to fetch the values from list
	
	System.out.println(list.get(0));//list index starts from zero///array index is also starts from zero
	System.out.println(list.get(3));

	
	//Remove operation
	
	list.remove(5);
	System.out.println(list);
	System.out.println(list.size()); // is removed from list so "swpnil" shift left side in this case if we have more than 100 values
	//then its time consuming of shift operation so system will get slow. so for frquent  removal operation AL is worst choice.
	
	
	//to print all values of list., there are 3 techniques
	//1)using for loop
	
	for (int i = 0; i < list.size(); i++) {
		
		System.out.print(list.get(i)+"  ");
	}
	
	//2)Using For Each Loop
	
	//for(Datatype variable : list) syntax of for each loop, we used here object as data type coz we used all type of data here
	
	for(Object var:list) { 

		System.out.println(var);
		
	}
	System.out.println("=====================================");
	//3)Using Iterator(it is an interface)
	//Iterator will gonna iterate indexex over list
	
	Iterator itr=list.iterator();
                                                                 //0th index...	
	while(itr.hasNext())// itr.hasNext it will check index of list |-|-|-|-|-|-|-| it is list
	{                                                            
		System.out.println(itr.next());// itr.next() wil return element of the list
	}
	
	//Generic Arraylist
	
	List<Integer> list1= new ArrayList<Integer>();
	list1.add(10);
	list1.add(null); //we can add null value in any data type
	
	int i=list1.get(0);
	System.out.println(i);// now in generic you can add any value to the int and we are not typecasting it.
	
	
	}

}
