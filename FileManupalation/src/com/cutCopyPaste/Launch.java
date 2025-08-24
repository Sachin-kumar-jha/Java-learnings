package com.cutCopyPaste;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Launch {

	public static void main(String[] args) throws Exception{
		/* 
		 * Serialization
		
		  Demo demo1 = new Demo(11,"raju","mi",20000);// Here need to add Serialization (Marker Interface)
		
		 FileOutputStream fos=new FileOutputStream("pqr.txt"); //Byte oriented
         ObjectOutputStream oos=new ObjectOutputStream(fos);
         
         oos.writeObject(demo1);
         
         Demo demo2 = new Demo(12,"kaju","market",30000);
         
         oos.writeObject(demo2);
         System.out.println("done");
         
         
		 
		
		//Deserialization
         
		 FileInputStream fi = new FileInputStream("pqr.txt");
		 ObjectInputStream ois = new ObjectInputStream(fi);
		 
		Demo d= (Demo)ois.readObject();
		System.out.println(d.toString());
		Demo d1= (Demo)ois.readObject();
		System.out.println(d1.toString());
		fi.close();
		ois.close();
		
//This copy paste
		
	String source="C:\\Users\\Sachin Jha\\OneDrive\\Pictures\\Screenshots\\serial.png";
	
		FileInputStream fis=new FileInputStream(source);
	    byte[] b= fis.readAllBytes();
	  //  fis.read(b);
	    
	    String destination = "D:\\coding practice\\imgae.png";
	   FileOutputStream fos= new FileOutputStream(destination);
	   fos.write(b);
	    */
		 String source = "D:\\coding practice\\imgae.png";
		String destination="C:\\Users\\Sachin Jha\\OneDrive\\Pictures\\Screenshots\\serial.png";
		
		FileInputStream fis=new FileInputStream(source);
	    byte[] b= fis.readAllBytes();
	  //  fis.read(b);
	    
	   
	   FileOutputStream fos= new FileOutputStream(destination);
	   fos.write(b);
	   
	   fis.close();
	   fos.close();
	   
	   new File(source).delete();
	}

}
