// concept of single and multi-level Inheritance
class Calc{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    } 
    
}
class AdvCalc extends Calc{       // single inheriatnce
    public int mul(int a, int b){
        return a*b;
    } 
    public int div(int a, int b){
        return a/b;
    } 
}
class PowCalc extends AdvCalc{   // Multi-level Inheritance
    public double power(int a,int b){
        return Math.pow(a, b);
    }
}
public class Inheritance {
    public static void main(String args[]){
        int a = 5,b = 3;
        PowCalc obj = new PowCalc();
        System.out.println("Addition: "+obj.add(a, b));
        System.out.println("Substraction: "+obj.sub(a, b));
        System.out.println("Multiplication: "+obj.mul(a, b));
        System.out.println("Division: "+obj.div(a, b));
        System.out.println("Power: "+obj.power(a, b));
    }
}
