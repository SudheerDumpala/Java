//Inner Class declaration and access

class Outer{
    public void  show(){
        System.out.println("This is outer class show() method");
    }
    class Inner{
        public void show1(){
            System.out.println("This is Inner class show() method");
        }
    }
}
public class InnerClass {
    public static void main(String args[]){
        Outer obj = new Outer();
        obj.show();
        Outer.Inner obj1 = obj.new Inner(); // we have to use the outer class to access the inner class also,
        //we need the object of the outer class to create the new object of the inner class.
        obj1.show1();
    }
}
