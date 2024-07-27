//Anonymous object concept in java
//Anonymous object is a one time usable object, it cannot be usen another time

class Show{
    public Show(){
        System.out.println("object created successfully");
    }
    public void add(int a,int b){
        int c = a + b;
        System.out.println(c);
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        int a = 5,b =6;
        new Show(); // anonymous object
        new Show().add(a,b);
    }
}
