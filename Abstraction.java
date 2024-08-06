/* Points to remember.
 * Every abstract method which is declared in the abstract class must be implemented
 * in the same class or other class.
 * an abstract class may or may not contain abstract methods, but an abstract method must be placed
 * inside the abstract class
 * The methods which have its implementation where it is defined (unlike abstract) are called "concreate methods"
 * It is necessary to define a class as abstract if we are declaring an abstract method.
 * We can't able to create the object of the class which is declared as abstract. 
 */
abstract class Hide{
    abstract public void hidden();
    public void shown(){
        System.out.println("This is a non-abstract shown() method");
    }
}
abstract class Hide1 extends Hide{
    @Override
    public void hidden(){
        System.out.println("This is an abstarct hidden() method");
    }
}
class Hide2 extends Hide1{
    public void hidden1(){
        System.out.println("This is the non-abstract hidden1() method");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Hide2 obj = new Hide2();
        obj.hidden();
    }
}
