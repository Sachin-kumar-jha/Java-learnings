package com.comparable;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Launch {
          public static void main(String[] args) {
			Employee e1=new Employee(1,18,"sachin");
			Employee e2=new Employee(2,19,"gagan");
			Employee e3=new Employee(3,28,"sinchan");
			
			//TreeSet<Employee> tset=new TreeSet<Employee>();// this for default comparison
			//TreeSet<Employee> tset=new TreeSet<Employee>(new orderBynameComparator()); // This is for custom comparison using implementing comparator on employee in separate class.
			
			TreeSet<Employee> tset=new TreeSet<Employee>();
			//Here reversing the result of default comparison by Collections utilities static method
			//Here Collections class all methods are static so we call by class.methodName.
			tset.add(e2);
			tset.add(e1);
			tset.add(e3);
			
		System.out.println(Collections.max(tset));
			//Here we implemented default comparison by writing logic in Employee by using implementing comparable interface.
			//But when we want to custom comparison then we use comparator interface to write custom comparison logic on the basis of object fields.
			//And this comparator direct pass to set constructor.
			System.out.println(tset);
			
		}
}
