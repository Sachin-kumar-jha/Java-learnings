package com.start;

//import java.util.*;

//import com.exception.CreateOwnException;

public class Launch {

	public static void main(String[] args) throws ClassNotFoundException{
		createException();
		//Unchecked Exception type(runtime exception)
		//Handled by try catch block
		
//		try {
//			Scanner sc= new Scanner(System.in);
//			int a =sc.nextInt();
//			int b=sc.nextInt();
//			int sum=a/b;
//			System.out.println(sum);
//			
//	}catch(RuntimeException e) {
//		System.out.println(e.toString());
//	}
//catch(InputMismatchException  e) {
//			System.out.println("Take Int Value");
//	}catch(ArithmeticException e) {
//			System.out.println("Arithmetic Exception exception occur");
//		}
		
//
//int age =17;
//if(age<18) {
//	try {
//		
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}


	}
	
	
	
	public static void createException() throws ClassNotFoundException{
		int age =17;
		if(age<18) {
				throw new ClassNotFoundException("Invalid age");
		} 
			
		}
	 

}
