// Introduction to Encapsulation (Oops concept)
// Usuage of "this" keyword
import java.util.Scanner;
class Encap{
    private String name;
    private int number;
    /*public void setName(String name,Encap obj){
        obj.name = name;
    }*/
    // "this" keyword is basically represents to the current object(The object which is calling the value)
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    /*public void setNum(int number,Encap obj){
        obj.number = number;
    }*/
    public void setNum(int number){
        this.number = number;
    }
    public int getNum(){
        return number;
    }

}
public class EncapIntro {
    public static void main(String[] args) {
        String name;
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = input.nextLine();
        System.out.println("Enter the name: ");
        number = input.nextInt();
        Encap obj = new Encap();
        //obj.setName(name,obj);
        //obj.setNum(number,obj);
        obj.setName(name);
        obj.setNum(number);
        System.out.println(obj.getName()+" : "+obj.getNum());
        input.close();
    }
}
