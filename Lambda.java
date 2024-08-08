// Lamda function
@FunctionalInterface
// Functional interface is an interface, which consists of only one method
interface Super{
    abstract public void method();
}
interface Parent{
    int add(int a, int b);
    // int sub(int a,int b);
}
public class Lambda {
    public static void main(String[] args) {
        Super obj = () -> System.out.println("This is the non-returning method");
        Parent obj1 = (a,b) -> a + b;
        obj.method();
        System.out.println(obj1.add(2, 3));
    }
}
