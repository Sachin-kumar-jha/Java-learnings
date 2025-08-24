package com.mainApp;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Launch {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
			// TODO Auto-generated method stub
while (true) {
System.out.println("P1 --> CreateFile\nP2-->ShowAllFiles\nP3-->ShowFileByName\nP4-->OpenFileByName\nP5-->DeleteFileByName\nP6-->Restore\nP7-->Exit");

int choice=scanner.nextInt();
if(choice==8) {
			 System.out.println("Invalid choice");
			 break;
}

switch(choice) {
case 1:
			String str= createFile();
			System.out.println(str);
			 break;
			 
case 2:
			ArrayList<String> al= ShowAllFiles();
			
			for(String filename:al) {
				System.out.println(filename);
			}
			 break;
			
case 3:

	       String name =  ShowFilesByName();
	     System.out.println(name);
			 break;
			 

case 4:
	openFileByName();
	 break;

case 5:
String delfileByBane=deleteFileByName();
System.out.println(delfileByBane);
	 break;

case 6:
	String s= restore();
	System.out.println(s);
	 break;

case 7:
	deleteAll();
	 break;

default:
			
			break;
			
}
}



	}

	private static void deleteAll() {
		String path = "C:\\Users\\Sachin Jha\\OneDrive\\Desktop\\Database";
		File file = new File(path);
		File[] listFiles = file.listFiles();
		
		for(File f : listFiles) {
			f.delete();
		}
		
		System.out.println("All  Files Deleted SuccessFully");
		
	}

	private static String restore() { 
		FileReader fr=null;
		FileWriter fw=null;
		try {
			 System.out.println("Enter filename:");
			    Scanner scanner=new Scanner(System.in);
			    String filename=scanner.next();
			    
			    String source = "C:\\Users\\Sachin Jha\\OneDrive\\Desktop\\Database\\backup"+ File.separator+filename;
			    String destination= "C:\\Users\\Sachin Jha\\OneDrive\\Desktop\\Database"+ File.separator+filename;
			   
			    File file =new File(source);
			    boolean exists = file.exists();
			   
			    
			    if(exists) {
			    	fr=new FileReader(source);
				    fw=new FileWriter(destination);
			    	int temp=0;
			    	while(temp>=0) {
			    		temp=fr.read();
			             fw.write(temp);
			    	}
			    	fr.close();
					fw.close();
					
					new File(source).delete();
			    	return "File Restored successfully";
			    }else {
			    	return "File Not Found";
			    }
			
		} catch (Exception e) {
			e.printStackTrace();
			return "Something went wrong";
		}finally {
			if(fr!=null && fw!=null)
				try {
					fr.close();
					fw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
					return "something went wrong";
				}
		}
   
   
	}

	
	private static String deleteFileByName() {
		try {
			String result = ShowFilesByName();
			String source = "C:\\Users\\Sachin Jha\\OneDrive\\Desktop\\Database"+File.separator+result;
			if(result.endsWith(".txt")) {
				backup(result);
				File file=new File(source);
				boolean delete=file.delete();
				if(delete) {
					return "File Deleted Successfully";
				}else {
					return "something went wrong";
				}
			}else {
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "something went wrong";
			
		}
		
		
	}

	private static void backup(String result) {
		FileReader fr=null;
		FileWriter fw=null;
		try {
			String source = "C:\\Users\\Sachin Jha\\OneDrive\\Desktop\\Database"+File.separator+result;
			String destination= "C:\\Users\\Sachin Jha\\OneDrive\\Desktop\\Database\\backup"+ File.separator+result;
		     fr = new FileReader(source);
			 fw = new FileWriter(destination);
			
			int temp=0;
			while(temp>=0) {
				temp=fr.read();
				fw.write(temp);
			}
			
		} catch (Exception e) {
		 e.printStackTrace();
		}finally {
			if(fr!=null && fw !=null )
				try {
					fr.close();
					fw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
		}
		
		
		
		
	}

	private static void openFileByName() {
		FileReader fr=null;
		try {
			String result = ShowFilesByName();
			if(result.endsWith(".txt")) {
				System.out.println("hello");
				String path= "C:\\Users\\Sachin Jha\\OneDrive\\Desktop\\Database"+File.separator+result;
				 fr=new FileReader(path);
				int temp=0;
				while(temp>=0) {
					temp=fr.read();
					System.out.println((char)temp);
				}
			}else {
				System.out.println(result);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(fr!=null)
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//File file =new File(path);
		
	}

	private static String ShowFilesByName() {
		try {
			//String path= "C:\\Users\\Sachin Jha\\OneDrive\\Desktop\\Database";
			//File file =new File(path);
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter file Name");
			String filename=scanner.next();
			
			ArrayList<String>al = ShowAllFiles();
			int idx = al.indexOf(filename);
			//String fname = al.get(idx);
			if(idx != -1) {
				return al.get(idx);
			}else {
				return "File not exists";
			}
		   
		} catch (Exception e) {
			return e.getMessage();
		}
		
		
		
      
	}

	private static ArrayList<String> ShowAllFiles() {
		ArrayList<String> al=new ArrayList<String>();
		String path= "C:\\Users\\Sachin Jha\\OneDrive\\Desktop\\Database";
		File file=new File(path);
		File[] listFiles = file.listFiles();
		for(File fl:listFiles) {
			al.add(fl.getName());
		}
		return al;
	}

	private static String createFile() {
		try {
			@SuppressWarnings("resource")
			Scanner scanner=new Scanner(System.in);
			System.out.println("***************CREATE FILE************");
			System.out.println("Enter File Name:");
			String fname=scanner.next();
			String path= "C:\\Users\\Sachin Jha\\OneDrive\\Desktop\\Database"+File.separator+fname;
			File file=new File(path);
			boolean newfile=file.createNewFile();
			if(newfile) {
				return "File Created Successfully";
			}else {
				return "File Already Exists";
			}
		} catch (Exception e) {
			return e.getMessage();
		}
		
		
		
		
		
	}

}
