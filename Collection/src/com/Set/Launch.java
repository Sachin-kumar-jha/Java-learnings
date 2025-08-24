package com.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Launch {

	public static void main(String[] args) {
		
//	HashSet has1=new HashSet(); //Non-Generic
//	HashSet<Object> hs=new HashSet<Object>(); //Generic
//	HashSet<?> hs2=new HashSet(); //WILD CARD GENERIC
//	
//	HashSet<Object> hs=new HashSet<Object>();
//	hs.add("raju");
//	hs.add("kaju");
//	hs.add("maju");
//	hs.add("maju"); //Not considered duplicates still giving only one time maju
//
//	hs.remove("maju");
//System.out.println(hs);
	
//LinkedHashSet<Object> hs=new LinkedHashSet<Object>();
//hs.add("raju");
//hs.add("kaju");
//hs.add("maju");
//hs.add("maju"); //Not considered duplicates still giving only one time maju
//
////hs.remove("maju");
//System.out.println(hs);
////Here order is preserved.


//TreeSet
		TreeSet hs=new TreeSet();
		
		hs.add(12345);
		hs.add(323);
		hs.add(342);
		hs.add(34);
/*
 		hs.add("hsad");
This will give error so make treeset Generic. 
 Exception in thread "main" java.lang.ClassCastException:
  class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer 
  and java.lang.String are in module java.base of loader 'bootstrap')
 */
		
//Here by default ascending order is preserved.
		
	System.out.println(hs);
		
	}

}
