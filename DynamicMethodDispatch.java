class A
{
    public void temp(){
        System.out.println("This is class A");
    }
}
class B extends A{
    @Override
    public void temp(){
        System.out.println("This is class B");
    }
}
class C extends B{
    @Override
    public void temp(){
        System.out.println("This is class C");
    }
}
public class DynamicMethodDispatch {
    public static void main(String args[]){
        A obj  = new A();
        obj.temp();
        obj  = new B();
        obj.temp();
        obj  = new C();
        obj.temp();
    }
}
