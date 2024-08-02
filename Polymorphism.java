/* Polymorphism means of a method having diffferent forms/behaviours
poly - different , morphism - forms/behaviours

polymorphism is of two types :
1) compile time polynorphism (method overloading)
2) runtime polymorphism (method overriding or dynamic method dispatch)*/

class Forms{
    protected int forms(int a, int b){
        return a+b;
    }
}
class Forms1 extends Forms{        // overloading the method forms
    public double forms(double c, double d){
        return c+d;
    }
    @Override   // overriding the method forms
    public int forms(int a, int b){
            return a * b;
    }
}

public class Polymorphism{
    public static void main(String[] args) {
       Forms1 obj = new Forms1();
        System.out.println(obj.forms(5,7));
    }
}