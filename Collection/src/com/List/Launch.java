package com.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Launch {

	   private static LinkedList<Employee> dataList;
	   
	   static {
		   dataList=new LinkedList<Employee>();
	   }
	   
	public static void main(String[] args) {
		/*
		Arraylist
		warnings bcz in Java 5: Collection(Generics)
		Building two types:
		1.Generic:only for same dataType
		2.Non Generic: any data Type used
		
		//This is Non-generic
		///
		ArrayList al=new ArrayList();
		al.add("raju");
		al.add(123);    //autoboxing
		al.add(false);
		al.add('a');
		
		System.out.println(al);
		
		//This is Generic 
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Hi");
		al2.add("Ram");
		al2.add("Shyam");
		al2.add("Rishi");
		System.out.println(al2);
		
		// This GENERIC Also
		ArrayList<Object> al3=new ArrayList<Object>();
		al3.add("raju");
		al3.add(233);
		al3.add(false);
		al3.add('l');
		System.out.println(al3);
		
	This is wild card generic :Unknown Type
		 ArrayList<?>al4=new ArrayList();
		 Only use readOnly
		 Here only we can add null;
		 al4.add(null);
		 
		 => Here Insertion order: Preserved
		 => Here index supported.
		 => Random access Supported
		 => Non Synchronized
		 => Duplicates are allowed
		 => null allowed
		 => Initail capacity : 10
		 => New capacity = initial capacity + inital capacity >> 1
		    => 10 + 10>>1
		    => 10+(101=5)=>15
		    
		 When you create an ArrayList it will create dynamic Array inside
		 ArrayList:Modification => Lot of shifting
		 Time consuming : increases
		 
		 => Use of ArrayList: Best suitable for fast data access
		 
		 => Do not use it for data modification
		 
		 
		 
		 Methods:
		 -> addAll : copy one arraylist element and paste another arraylist element
		 -> remove : by index and by value 
		 -> removeAll(another arralist) : remove all values that is present in another arralist
		 -> al.clear() : all clear .
		 
		 -> get: By index pass indx
		 -> contains(_): check value is present return boolean
		 -> indexOf(): return index of value
		 -> isEmpty(): return boolean
		 
		 Iteration:
		 
		=> Simple for loop 
		 
		 for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		=> ForEach Loop
		
		for(Object o:al) {
			System.out.println(o);
		}

   => Built-in Iterator
    
    ArrayList<Object> al3=new ArrayList<Object>();
		al3.add("raju");
		al3.add(233);
		al3.add(false);
		al3.add('l');
		System.out.println(al3);
		
		Iterator<Object> itr=al3.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


     => sublist : al3.sublist(1,3); // 1,2 index element and return sublist
     
*/
		
		//LINKEDLIST
 /*
    => LinkedList same as ArrayList but this best for datamanipulation
	=> Best suitable for data manipulation
	 
	 */

// Vector
		/*
		 => Legacy class
		 => Same as ArrayList
		 => Here Insertion order: Preserved
		 => Here index supported.
		 => Random access Supported
		 => Synchronized
		 => Duplicates are allowed
		 => null allowed
		 => Best suitable for fast data access in Thread Safe Env.
		 
		 
		 */
		
// Project

	
	Scanner scanner = new Scanner(System.in);
		
while (true) {

System.out.println("Enter Choice:\nEnter choice for write:1\nEnter Choice for read:2\nEnter choice for Exit:5\n");
int choice=scanner.nextInt();

if(choice==5) {
			 System.out.println("Thanks for Using");
			 break;
}

switch(choice) {

case 1:
	while(true) {
		System.out.println("Enter Eid");
		int eid=scanner.nextInt();

		System.out.println("Enter Ename");
		String ename=scanner.next();

		System.out.println("Enter Eaddress");
		String eaddress=scanner.next();

		System.out.println("Enter Salary");
		int Salary=scanner.nextInt();
		
		ArrayList<String> listofBooks=new ArrayList<String>();
		ArrayList<String> listofContacts=new ArrayList<String>();
		
		while(true) {
			System.out.println("Enter Book Name:");
			String Bookname=scanner.next();
			listofBooks.add(Bookname);
			System.out.println("Do U want add More Books Y/N");
			char x=scanner.next().charAt(0);
			if(x=='N') break ;
		}
		
		while(true) {
			System.out.println("Enter Contact :");
			String contact=scanner.next();
			listofContacts.add(contact);
			System.out.println("Do U want add More Contacts press Y/N");
			char x=scanner.next().charAt(0);
			if(x=='N') break ;
		}
		
		
		Employee emp = new Employee(eid,ename,eaddress,Salary,listofBooks,listofContacts);
		dataList.add(emp);
		System.out.println("Do U want add More Emp press Y/N");
		char x=scanner.next().charAt(0);
		
		if(x=='N') { ;
		System.out.println("EMPLOYEE ADDED SUCCESSFULLY");
		break;
		}
	}

	break;

case 2:
	for(Employee emp:dataList) {
		 System.out.println(emp.getEid());
		 System.out.println(emp.getEname());
		 System.out.println(emp.getSalary());
		 System.out.println(emp.getEaddress());
		 List<String> listofBooks=emp.getListofBooks();
		 System.out.println(listofBooks);
		 List<String> listofContacts = emp.getListofContacts();
		 System.out.println(listofContacts);
	}
   
	break;

case 3:
	break;

case 4:
	break;

default:

	break;

}
}
	
	
}

}
		 
