package com.wildCard;

import java.util.ArrayList;

public class Launch {

	public static void main(String[] args) {
		
		
		ArrayList<String> data=new sachinCollection<String>();
		data.add("sachin");
		data.add("raju");
		data.add("maju");
	
		//ArrayList <?> al=new ArrayList(); //UNKOWN TYPE
		
		ArrayList<?> al=data; 
		//Here we give a method to only read access not add but remove.
		//So that this used Read Only
    pass(al);
	}
	
	public static void pass(ArrayList<?> al) {
		//al.add("mohan");
		al.add(null); //Here only add null 
	// If we need to prevent the not even null store then we override add method of ArrayList we create our own 
		//Collection by extending ArrayList.
		
    //Here NotNullException given by your customized collection.
	}

}
