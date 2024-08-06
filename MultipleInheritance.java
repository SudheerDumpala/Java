/* In java, Multiple Inheritance is not directly allowed
 * so we use the concept of Interfaces to acheive that.
 * 
 * class to class  ->   extends
 * interface to class  -> inplements
 * interface to interface  -> extends
 */

 
interface X{
    void walk();
    void run();
}
interface Y{
    void jump();
    void run();
}
interface P extends Y{

}
class z implements X,P{
    public void walk(){
        System.out.println("Sudheer is walking");
    }
    public void run(){
        System.out.println("Sudheer is running");
    }
    public void jump(){
        System.out.println("Sudheer is jumping");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        X obj;
        obj = new z();
        obj.walk();
        obj.run();
        P obj1 = new z();
        obj1.jump();
    }
}
