/*CONCEPT OF STATIC VARIABLES AND STATIC METHODS */
class Mobile{
    String name;
    int model;
    static String madein;

    public void info(){
        System.out.println(name+" : "+model+" : "+madein);
    }
    public static void show(Mobile obj){
        System.out.println(obj.name+" : "+obj.model+" : "+madein);
    }
}
public class StaticMethod{
    public static void main(String args[]){
    
        Mobile m1 = new Mobile();
        m1.name = "Nokia";
        m1.model = 1100;
        Mobile.madein = "INDIA";
        Mobile m2 = new Mobile();
        m2.name = "Lava";
        m2.model = 0011;
        Mobile.madein = "BHARAT";

        m1.info();
        m2.info();

        Mobile.show(m2);
    }
    
}
