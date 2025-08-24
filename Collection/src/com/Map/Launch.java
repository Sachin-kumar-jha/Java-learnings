package com.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Launch {

	public static void main(String[] args) {
   /*     HashMap hashMap=new HashMap(); //Non Generic
        HashMap<?,?> hs=new HashMap();//Wild card Generic

		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(1, "Sachin");//Encapsulated as entry object
		hs.put(2, "Gagan");
		hs.put(3, "Rishi");
		hs.put(5, "Chaman");
		
		hs.remove(1);
		System.out.println(hs);
		
//Here order doesn't preserved in hashMap
///	
Set< Entry<Integer,String> > entry = hs.entrySet();
Iterator<Entry<Integer,String>> iterator=entry.iterator();

while(iterator.hasNext()) {
    Entry<Integer,String>entery = iterator.next();
    System.out.println(entery.getKey()+" "+ entery.getValue());
    
}


//LinkedHashMap
		
		LinkedHashMap<Integer,String> hs=new LinkedHashMap<Integer,String>();
		
		hs.put(1, "Sachin");//Encapsulated as entry object
		hs.put(2, "Gagan");
		hs.put(3, "Rishi");
		hs.put(5, "Chaman");
		
		//hs.remove(1);
		System.out.println(hs);//Here order preserved.

		
// TreeMap
		TreeMap<Integer,String> hs=new TreeMap<Integer,String>();
//Here always make it generic because it comparing and giving ascending order by default. 
		hs.put(1, "Sachin");//Encapsulated as entry object
		hs.put(2, "Gagan");
		hs.put(3, "Rishi");
		hs.put(5, "Chaman");
		
		//hs.remove(1);
		System.out.println(hs);//Here order preserved.
*/
		
		//Pincode ==> 5 cars
		//Integer ==> List<String>
		HashMap <Integer,List<String>> hs=new HashMap<Integer,List<String>>();
		
		ArrayList<String> area1 = new ArrayList<String>();
		area1.add("abc");
		area1.add("bcd");
		area1.add("cde");
		
		ArrayList<String> area2 = new ArrayList<String>();
		area2.add("abcd");
		area2.add("abcdsere");
		area2.add("abcdsadsd");
		ArrayList<String> area3 = new ArrayList<String>();
		area3.add("abcde");
		area3.add("abcdsfd");
		area3.add("abcdsds");
		
		hs.put(1, area1);
		hs.put(2, area2);
		hs.put(3, area3);
		for(Entry<Integer,List<String>> e : hs.entrySet()) {
			System.out.println("For Pincode= "+e.getKey());
			 List<String> str=e.getValue();
			 for(String s:str) {
				 System.out.println(s);
			 }
			 //System.out.println(e.getKey()+" "+ str);
		}
	
		
	}

}
