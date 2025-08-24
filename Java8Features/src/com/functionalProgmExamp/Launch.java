package com.functionalProgmExamp;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Launch {

	public static void main(String[] args) {
//String words[]= {"rajux","Kajuxy","amanxdds","arunsfdeee"};
//		
////		Consumer<String> con=new Consumer<String>() {
////
////			@Override
////			public void accept(String t) {
////				System.out.println(t.length());
////			}
////			
////		};
//		
////Lambda Expression
//		
////		Consumer<String> con= (t)-> {
////			System.out.println(t.length()); 
////		
////		};
//		
//
//		Consumer<String>con=LambdaFactory();
//		
//		for(String s:words) {
//			con.accept(s);
//		}
//		
//		xyz(con);
//		
//		
//	}
//
//	public static void xyz(Consumer<String> con) {
//		String words[]= {"rajux","Kajuxy","amanxdds","arunsfdeee"};
//		
//		for(String s:words) {
//			con.accept(s);
//		}
//		
//		
////		Consumer<String> con= (t)-> {
////			System.out.println(t.length()); 
////		
////		};
////		
////		for(String s:words) {
////			con.accept(s);
////		}
//		
//		//When we here write same code then here code redundancy occurs so we use 
//		//reusable function through taking as argument.
//	}
//	
//	//Here we can also create factory of reusable lambda functions and use wherever we needed.
//	
//	public static Consumer<String> LambdaFactory(){
//		
//		Consumer<String> consumer;
//		consumer=(name)->System.out.println(name.length());
//		return consumer;
//		
		
		
		

//Runnable r1 = new Runnable(){
//         @Override
//         void run(){
//         for(int i=1;i<=10;i++){
//         Syso(7*i);
//         }
//      }
//    }
//    
// Runnable r1 = new Runnable(){
//         @Override
//         void run(){
//         for(int i=1;i<=10;i++){
//         Syso(5*i);
//         }
//      }
//    }
//    
//    
//    Thread t1 = new Thread(r1);
//    Thread t2 = new Thread(r2);
//    
//    t1.start();
//    t2.start();
//    
   //Here we implemented sort of functional programming but 
   /// here we can reduce more line of code using lambda expression like that
   
//   Runnable r1= () -> {
//   for(int i=1;i<=10;i++){
//         System.out.println(7*i);
//   }     
//    };
//    
//    
//    Runnable r2= () -> {
//   for(int i=1;i<=10;i++){
//         System.out.println(5*i);
//   }     
//    };
//    
    
//    Thread t1 = new Thread(r1);
//    Thread t2 = new Thread(r2);
    
   //more concise way
    
//    Thread t1 = new Thread(() -> {
//    	   for(int i=1;i<=10;i++){
//    	         System.out.println(7*i);
//    	   }     
//    	    });
//    Thread t2 = new Thread(() -> {
//    	   for(int i=1;i<=10;i++){
//    	         System.out.println(5*i);
//    	   }     
//    	    });
//    
//    
//    t1.start();
//    t2.start();
    
    //And more short format
    
//  new Thread(() -> {
// 	   for(int i=1;i<=10;i++){
// 	         System.out.println(7*i);
// 	   }     
// 	    }).start();
//     
// new Thread(() -> {
// 	   for(int i=1;i<=10;i++){
// 	         System.out.println(5*i);
// 	   }     
// 	    }).start();;
// 
  
// ForEach Loop
 	    
// 	  ArrayList<Integer> al=new ArrayList<Integer>();
// 	    
// 	  al.add(1);
// 	  al.add(2);
// 	  al.add(3) ; 
// 	  al.add(4);
// 	  
// 	 Consumer<Integer>con = new Consumer<Integer>(){
// 	 	  @Override
// 	 	public  void accept(Integer t){
// 	 	  System.out.println(t);
// 	 	  };
// 	 	  
// 	 };
 	 
 	 
 	 //This sort way 
 	 
// 	 Consumer<Integer> con1=(t)->System.out.println(t);
// 	 al.forEach(con1);
// 	 
// 	 //This is shortest way 
// 	  al.forEach(t->System.out.println(t));
// 	  
// 	  Function<Integer,Integer> fn= (t)->{
// 		  return t+5;
// 	  };
// 
//	
//	for(Integer t:al) {
//		System.out.println(fn.apply(t));
//	};
	
 	 // IF collection here if we want to multiply by 5, then addition and then max find these operational logic are so long so stream api solve this problem
 	
 	//Stream created
 	//Stream<Integer>stream=al.stream();
 	//Here only creation of a pipe to data source not storing data
 	
 	//Stream consumed here created an replica of collection and perform on this stream methods
 	
 	//Stream<Integer>filter=stream.filter((t)-> t%2==0);
 	//Stream<Integer>map = stream.map(n->n*2);
 	//Stream<Integer>stream=al.stream();
 	
 //Integer result=map.reduce(0,(a,b)->a+b);
 //0+10=>10   10 + upcoming => new result and so on .
// System.out.println(result);
 	//map.forEach(t->System.out.println(t));
 	
 	//filter.forEach(t->System.out.println(t));
 	//System.out.println();
 	
//Last Lesson
		
		LocalDate now=LocalDate.now();
		System.out.println(now);
		
		String date=now.toString();
		System.out.println(date.concat("Nice Day"));
		
		boolean leapYear=now.isLeapYear();
		System.out.println(leapYear);
		
		LocalDate plusYear = now.plusYears(5);
		System.out.println(plusYear);
		
		LocalDate plusWeeks=now.plusWeeks(70);
		System.out.println(plusWeeks);
		
		LocalDate res=now.plusYears(5).plusWeeks(70).plusMonths(3);
		System.out.println(res);
		
		LocalDate minusWeeks=res.minusYears(5).minusWeeks(70).minusMonths(3);
		System.out.println(minusWeeks); //YY-MM-DD
		
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String format=minusWeeks.format(ofPattern);
		System.out.println(format);
		
		int dayOfMonth=now.getDayOfMonth();
		System.out.println(dayOfMonth);
		
		DayOfWeek dayOfWeek=now.getDayOfWeek();
		System.out.println(dayOfWeek);
		
	}

}
