// enum class in java

enum Mobiles{
    Samsung(2000),Iphone(2200),Vivo(600),Redmi,Nokia(1500);
    //by default, all these are objects. but when we pass values into them, they are constructors.
    private int price;
    private Mobiles(){ // private constructors because, sll the objects are drfined locally.
        // This is default constructor to handle the objects which are not handled by 
        // the parametarised constructor (Redmi).
    }
    private Mobiles(int price){
        this.price = price;
    }
    public int getValue(){
        return price;
    }
    public void setvalue(int price){
        this.price = price;
    }
}
public class Enum{
    public static void main(String[] args) {
        Mobiles.Redmi.setvalue(500); // assigning the value to the 'Redmi' using the setter method.
        for(Mobiles Type : Mobiles.values()){
            System.out.println(Type+" "+Type.getValue());
        }
    }
}