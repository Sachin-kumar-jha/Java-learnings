package com.start;

import java.util.Scanner;

import com.controller.MyController;
import com.dto.Employee;



public class Launch{

	public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)){
			 
			   MyController ctrl = new MyController();
			// TODO Auto-generated method stub
   while (true) {

 
   int choice=scanner.nextInt();
   if(choice==5) {
			 System.out.println("Invalid choice");
			 break;
  }
 
 switch(choice) {
 case 1:
			 System.out.println("Enter Eid");
			 int eid=scanner.nextInt();
			 
			 System.out.println("Enter Ename");
			 String name=scanner.next();
			 
			 System.out.println("Enter Age");
			 int age=scanner.nextInt();
			 
			 System.out.println("Enter Eaddress");
			 String address=scanner.next();
			 
			 System.out.println("Enter Salary");
			 int salary=scanner.nextInt();
			 
			Employee emp = new Employee(eid,age,address,salary,name);
			String result=ctrl.getData(emp);
			
			System.out.println(result);
			 break;
			 
 case 2:
			Employee[] arr=ctrl.read();
			for(Employee e:arr) {
				if(e!=null) {
					System.out.println(e.getEid());
					System.out.println(e.getName());
					System.out.println(e.getAddress());;
					System.out.println(e.getAge());
					System.out.println(e.getSalary());
				}
				
				
			}
			 break;
			
 case 3:
	      System.out.println("Hello");
			 break;
			 
 case 4:
	     System.out.println("Hello world");
			 break;
			 
default:
	System.out.println("Default call");
			break;
			
 }
 
 }
		}
	}


}	


