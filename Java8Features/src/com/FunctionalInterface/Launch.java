package com.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Launch {

	public static void main(String[] args) {

//Consumer
		String words[]= {"rajux","Kajuxy","amanxdds","arunsfdeee"};
		
		Consumer<String> con=new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t.length());
			}
			
		};
		
//Lambda Expression
		
		Consumer<String> con1= (t)-> {
			System.out.println(t.length()); 
		
		};
		
		for(String s:words) {
			con1.accept(s);
		}
		
		
		
/*	
	Supplier<String> sup = new Supplier<String>() {

		@Override
		public String get() {
			
			return "Hello Custom";
		}
		
	};
	
	//Lambda
	Supplier<String> sup2 = ()->"sachin";
	
	System.out.println(sup2.get());
		
	
 * 
 * 
 * int num[]= {1,2,3,4,5,6};

String words[]= {"raju","Kaju","aman","arun"};


// Function inbuilt interface

Function<String,String>fun =new Function<String,String>(){

	@Override
	public String apply(String t) {
		
		return t.toUpperCase();
	}
	
};
//Lambda expression of above code.

Function<String,String>fun2 = (t)->t.toUpperCase();

for(String s:words) {
	String a=fun2.apply(s);
	System.out.print(a+" ");
}


 *   Predicate Interface 
 *   
 * 		Predicate<Integer> predicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%2==0;
			};
			
		};

 * 
 * 
 * 	
 * Lambda Expression of Above code:
 * Predicate <Integer>predicate = (t)->{
			 return t%2==0;
		  };
		
		for(int a:num) {
			boolean res=predicate.test(a);
			if(res) System.out.println(a);
		}
 * 	
 */
  


		// Here we use fnInterface using anonymous inner class
		
/*  
 * It is before lambda expression
		  fnInterface sol = new fnInterface() {

			int sum1=0;
			@Override
			public int sum(int[] arr) {
				for(int a:arr) {
					sum1+=a;
				}
				return sum1;
			};
			
		};
		
		
		
		System.out.println(sol.sum(num));
	 */
		
//After converting in Lambda Expression
		
//fnInterface sol = (element) -> {
//			
//			int sum1=0;
//			for(int a:element) {
//				sum1 += a;
//			}
//		return sum1;
//	};
//	
//
//System.out.println(sol.sum(num));	
	


	}

}
