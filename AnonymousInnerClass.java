//Anonymous Inner class
class OuterClass{
    public void run(){
        System.out.println("Outer class is running successfully");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass()
        {
            @Override
            public void run(){
                System.out.println("Outer class is Executing Successfully");
            }
        };
        obj.run();
    }
}
