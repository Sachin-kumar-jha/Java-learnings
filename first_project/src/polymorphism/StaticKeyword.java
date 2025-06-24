package polymorphism;

/** Static keyword
 * it is used for memory management (save Memory)
 * Here variables,methods,block,nested classess will be static
 *
 *Static Variable(Class Variable)
 *Local variable can't be static
 *Memory Allocation at the time of Class loading(Method area me)
 *
 * 
 * Static Block
 * static {
 *  for using initializing the static variable at the time of class loading
 *  
 * }
 * 
 */
public class StaticKeyword {
	private int age;
	private String name;
	private int salary;
	//private static int a=10;//This class variable
	public StaticKeyword(int age, String name, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
   @Override
	public String toString() {
		return "StaticKeyword [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
