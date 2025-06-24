package first_project;
import java.util.Scanner;
public class Launch {

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
//		Data d =new Data();
//		d.setAge(20);
//		d.setId(1);
//		d.setName("Sachin Jha");
//		
//	 Destination dest=	new Destination();
//	 dest.xyz(d);
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Size of ARRAY:");
//		int size=sc.nextInt();
//		
//		arrProblem arr[]=new arrProblem[size];
//        System.out.println("Enter empl1 details:");
//        int id1=sc.nextInt();
//        int age1=sc.nextInt();
//        
//        System.out.println("Enter empl2 details:");
//        int id2=sc.nextInt();
//        int age2=sc.nextInt();
//        
//        
//        
//		arrProblem emp1=new arrProblem(id1,age1);
//		arrProblem emp2=new arrProblem(id2,age2);
//		
//		arr[0]=emp1;
//		arr[1]=emp2;
//		
//		for(arrProblem emp:arr) {
//			System.out.println(emp.getId());
//			System.out.println(emp.getAge());
//		    
//		}
//		
		
		
//	
//     String str="";
		//StringPractice s=new StringPractice();
		//System.out.println(s.checkPallindrom(str));
		//String []arr=s.PrintString();
	//	System.out.println(s.CalculateSubstring(str));
		//System.out.println(s.ShiftByValue(str));
		
//		for(String a:arr) {
//			System.out.println(a);
//		}
		
//		String st="this is my car";
//		String b[]=st.split(" ");
//		
//		String newStr="";
//		
//		
//		for(int i=0;i<=b.length-1;i++) {
//			
//			//System.out.println(el);
//			
//			for(int j=0;j<b[i].length()-1;j++) {
//	               
//      				str=b[i].substring(0,1);
//					String str1=str.toUpperCase();
//					//System.out.println(str1);
//					
//					newStr+=str1;
//					
//			}
//			
//			newStr+=b[i];
////			String c=el.substring(0);
////			System.out.println(c);
////			for(int i=0;i<c.length()-1;i++) {
////				    if(i==0) {
////				    	;
////				    	
////				    			
////				    }
////			}
////			
////			
////			newStr+=c.charAt(0);
////			newStr+=el;
////			
//		}
//		
//	System.out.println(newStr);
        
        /**     
 Contains Method
 String.contains("substr");
 
      
 IndexOf()
 string.indexOf('q')
 Here we find the index of given character from the String.
 This will give that index where your given substring is passed to find index.
 This will give first index of occurence of character index
        
  LastIndexOf method 
  This will give us last occurence of index given substring or character
   
 Replace method:
 string.replace("car","bike");
  Here car is replaced by bike 
        
CompareTo() method
Return integer value
lexicographically compare krta h uniquecode compare krta h.
here return a.compareTo(b); then here a's unique code is 97 and b's unique code is 98 so here a-b=97-98 give -1
        
String a="hello";
String b="hello";
int compareTo=a.compareTo(b);
System.out.println(compareTo); 
        
Here in java if we take input then the next method add the alphabets and numbers and add /n add the end of string 
Here .next() method only read words from buffer and nextLine read all the value that buffer contains including /n
        
So when we try to taking input first via .next() method it takes word only and the /n is already present in buffer then we try 
to take input full string from keyboard there not taking input because in buffer memory /n present and the nextline() read the buffer and 
Move cursor to the nextline after consuming /n from the buffer


eg.
       String name=sc.next();
       Syso(name);
       String fullname=sc.nextLine();
       Syso(fullname);
       
       Output:Sachin
         - print:Sachin
         -(simple nextLine not taking input for fullName)
         
    -- This is an example of above problem
        
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String str=sc.next();
	   
		System.out.println(str);
		
		System.out.println("Enter fullName");
		String output=sc.nextLine();
        System.out.println(output);
        
 Where String user input get stored?
 
       -:In NON CONSTANT POOL
       ->In Java any dynamically created strings are stored inside the non constant pool
  
 Why not store  in Constant pool:
     -> String pool lookups are computationally expensive
       
  -> Java ensure that Strings literals and dynamically created String are managed seperately.
    
    examle: String literals:
                 - String name:"Raju"
         
         this is example of string literals and stored in constant pool.
      ** constant pool also known as intern pool.   
         
=> When we create String using string methods like :concate(),replace(),substring()etc will store inside non constant pool.
=> If you create a String using new keywords it will store inside non constant pool.

=> We can push a string from non constant pool to constant pool and this is called String interning.

example:
String name="raju";
	String name2=new String("raju");
	name2= name2.intern();
	
	System.out.println(name==name2); //This gives true because both strings are in constant pool.


**Mutable String**
*
* We can create mutable String in two ways in java
*1.StringBuffer class(Slow in performance)
*2.StringBuilder class

		//1.StringBuffer class:synchronized:multithreadin
		
     StringBuffer stringbuffer=new StringBuffer("Mohan");
     
     stringbuffer.append("raju");
     stringbuffer.append(1);
     
     System.out.println(stringbuffer); //Mohanraju1
     
   //2.StringBuilder class: non synchronized:multithreading
   StringBuilder stringbuilder=new StringBuilder("Mohan");
     
     stringbuilder.append("raju");
     stringbuilder.append(1);
    
     System.out.println(stringbuilder);

Methods of stringBuffer:
=>append :stringbuffer.append("anything");

=>insert():
 
             stringbuffer.insert(5,"ABC"); //insert at index 5
             
             
=> replace():
            stringbuffer.replace(2,5,"XYZ"); //Occupy 234 index repace with XYZ
            
=>delete():
         stringbuffer.delete(5,8);//delete element at index 567
         

=>length():gives length

=>reverse():Reverse the string

=>setLength(5):
           stringbuffer.setLength(5);//return 5 length string 
           
=>All methods of string included here

==> (In SingleThreaded Env we use StringBuilder)
*/	


		
		}

}
 