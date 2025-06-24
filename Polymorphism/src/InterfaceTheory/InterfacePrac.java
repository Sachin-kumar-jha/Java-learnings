package InterfaceTheory;

/** Interface
 * interface is just a block of code 
 * eg. public interface Demo{
 * }
 * 
 * Interface is just a blueprint of your class
 * Interface is used to achieve Standardization
 * 
 * Through interface we can achieve multiple inheritance
 * 
 * Through interface we can achieve loose coupling
 * 
 * In interface we only create an abstract method in java 8 tk.
 * 
 * 
 * Interface can't contain method with its body but inside an interface we can only create abstract method 
 */
public interface InterfacePrac {
  //public abstract void abc(); //Here abstract keyword is optional without this keyword it is also an abstract method
   public void abc();//This valid for abstract method
   public void bcd();
   //Here is not any body so here memory space is not given
   //So here an interface never create an instance or object of an interface.
   //This is blueprint for class not for object.
}
