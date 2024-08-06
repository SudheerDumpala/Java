interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("functions: build - compile - run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("functions: build - compile - run - faster");
    }
}
class Developer{
    public void devApp(Computer reference){
        reference.code();
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer sudheer = new Developer();
        sudheer.devApp(lap);
        sudheer.devApp(desk);
    }
}
