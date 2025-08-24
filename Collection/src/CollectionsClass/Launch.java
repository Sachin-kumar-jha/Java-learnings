package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

import com.comparable.Employee;

public class Launch {

	public static void main(String[] args) {
//		Employee e1=new Employee(1,18,"sachin");
//		Employee e2=new Employee(2,19,"gagan");
//		Employee e3=new Employee(3,28,"sinchan");
//		
//		ArrayList<Employee> ls=new ArrayList<Employee>();
//		
//		ls.add(e1);
//		ls.add(e2);
//		ls.add(e3);
//		System.out.println(ls);
//		Collections.sort(ls);
//		System.out.println(ls);
		
		ArrayList<Integer> l =new ArrayList<Integer>();
		
		l.add(12);
		l.add(12);
		l.add(12);
		l.add(123);
		l.add(344);
		l.add(323);
		
		System.out.println(l);
		
	
//		Collections.sort(l);
//		System.out.println(l);
//		Collections.reverse(l);
//		System.out.println(l);
//		Collections.shuffle(l);
//		System.out.println(l);
//		//Collections.binarySearch()
//		System.out.println(Collections.max(l));
		
//		Collections.binarySearch(l,12);
//		int binarySearch = Collections.binarySearch(l,123);
//		System.out.println(binarySearch);
		
		int frequency = Collections.frequency(l, 12);
		System.out.println(frequency);
	}

}
