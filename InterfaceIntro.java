// Interfaces are by default "PUBLIC and ABSTRACT"
// In interface, Instance variables are default set to "STATIC and FINAL"
interface A{
    void config(); // we may not declare the method as public and abstract as it is already set by default
}
class Configuration implements A{
    @Override
    public void config(){
        System.out.println("This is a config() method");
    }
}
public class InterfaceIntro{
    public static void main(String args[]){
        Configuration obj;
        obj = new Configuration();
        obj.config();
    }
}