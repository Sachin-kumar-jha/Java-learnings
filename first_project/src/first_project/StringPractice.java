package first_project;

public class StringPractice {
    // String methods
	
	//length
	//charAt
	//startsWith
	//endsWith
	//Split

	String para = "I am a Developer";
	
public String[] PrintString() {
	//ASCII value printing by holding it a character in integer variable	
	int value=para.charAt(0);
	
	char chartr=(char)value;
	System.out.println(chartr);
	
	//Direct method to find unicode or ascii code using getByte method it returns a array with return type byte
	
byte[] b= para.getBytes();

for(byte el:b) {
	System.out.println(el);
}
	System.out.println(value);
		String[] s= para.split("");
		return s;
	}
	
public boolean checkPallindrom(String s) {
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev+=s.charAt(i);
	}
	System.out.println(rev);
	if(rev.equals(s)) return true;
	else return false;
}
	


public String ShiftByValue(String s) {
	String shiftedstring="";
	
	for(int i=0;i<=s.length()-1;i++) {
		int code= s.charAt(i);
		if(code == 122) {
			System.out.println("Here z found"+code);
			code= 96;
		}
		int ShiftedCode=code + 5;
		
		char a=(char)ShiftedCode;
		shiftedstring+=a;
	}
	return shiftedstring;
}


public String CalculateSubstring(String s) {
	//It return o to last same string because here we don't mention the last index or ending index of substring
	//String substr=s.substring(0);
	String substr1=s.substring(0,2);
	return substr1;
}
}


//Question:String s="this is my car"
//Output:This Is My Car


