public class ConstructorOverload {
    int id;
    String name;
    ConstructorOverload(){
        System.out.println("This is constructor over loading");
    }
    ConstructorOverload(int i,String word){
        id = i;
        name = word;
    }
    public static void main(String args[]){
        ConstructorOverload obj  = new ConstructorOverload();
        ConstructorOverload obj1 = new ConstructorOverload(1240,"sudheer");
        System.out.println("The id no is "+obj1.id);
        System.out.println("The name is: "+obj1.name);
    }
    
}
