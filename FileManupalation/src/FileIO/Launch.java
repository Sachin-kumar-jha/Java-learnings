package FileIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;



public class Launch {

	public static void main(String[] args) throws IOException {
/*	 String s="this is my car";
		byte[] b=s.getBytes();
		
//		for(byte e:b) {
//			char t=(char)e;
//			
//			System.out.println(t);
//			System.out.println(e);
//		}
		
		FileOutputStream fos=new FileOutputStream("D:\\coding practice\\abc.txt");
		fos.write(b);
		System.out.println("Data stored successfully");
		
		 * For writing data in a file we creating pipeline for copying your data 
		 * RAM TO Hard disk using a Stream name is OutputStream and here byte streaming 
		 * happens means here byte streaming through this pipe Ram to HDD. 
		 * So first of all we create data in byte then pass to the OutputStream.
		 
		String s="";
	   FileInputStream file=new FileInputStream("D:\\coding practice\\abc.txt");
	   int temp = 0;
	   while(temp >= 0) {
		   int b = file.read();
		   char c=(char)b;
		   s += c;
		    temp=b;
			
	   }
	   file.close();
	   
	   //Here in inputstream string is one time give only one byte.
	
		System.out.println(s);	
		
		System.out.println(new File("D:\\\\coding practice\\\\abc.txt").delete());
		//Here this giving me false value bcz here we need to close the input stream after closing
		//Then the delete method works.
		
		
		
// Read from a file if first character is vowel than copy the name to the another file.
		String s="";
		FileInputStream file=new FileInputStream("D:\\coding practice\\abc.txt");
		   int temp = 0;
		   while(temp >= 0) {
			   temp = file.read();
			   char c=(char)temp;
			     s += c;
			     
			     
			     String str[]=s.split(" ");
				   
			     FileOutputStream fos = new FileOutputStream("D:\\coding practice\\abc2.txt");
			     for(String a:str) {
			     	if(a.charAt(0)=='a' || a.charAt(0)=='e' || a.charAt(0)=='i' || a.charAt(0)=='o' || a.charAt(0)=='u' || a.contains(" ")) {
			     	String st = a.concat(" ");
			     		byte[]d = st.getBytes();
			     		fos.write(d);
			     		System.out.println("Write successfully");
			     	}
			     }
			     fos.close();
			    //temp=b;
				
		   }
		   file.close();
		   

		
		FileOutputStream fos = new FileOutputStream("pqr.txt");
          fos.write("kaju".getBytes());
		System.out.println();
		System.out.println("File createdSuccessfully");
		fos.close();
		
		
		FileInputStream fi=new FileInputStream("pqr.txt");
		int b=fi.read();
		System.out.println(b);
		fi.close();
		
		File file=new File("pqr.txt");
	boolean ab=	file.delete();
		System.out.println(ab);


//Creating folder
	String foldername=new Scanner(System.in).next();
	File file = new File("D:\\coding practice"+File.separator+foldername);
	boolean mkdir=file.mkdir();
	System.out.println(mkdir);
	
		
//Read & write data using Buffer
		
		FileInputStream fi=new FileInputStream("D:\\coding practice\\abc.txt");
		BufferedInputStream bi=new BufferedInputStream(fi);
		
		while(true) {
			int data=bi.read();
			char c=(char)data;
			System.out.print(c);
			if(data==-1) {
				break;
			}
		}
		bi.close();
		fi.close();


		FileOutputStream fos=new FileOutputStream("D:\\coding practice\\abc2.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		bos.write("kaju".getBytes());
		System.out.println("Stored successfully");
		bos.close();
		fos.close();
		
*/
		
		
		
	}

}
