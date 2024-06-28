// INTRO TO METHODS IN JAVA 

class methods
 {
    public int square(int num){
        return num * num;
    }
    public String temporary(int a) {
        if(a==1)
            return "The value of a is 1";
        return "This is a temporary string";
    }
    
}

public class Methods {
    public static void main(String args[]){
        int n = 5;
        int a = 2;
        methods obj = new methods();
        int result = obj.square(n);
        System.out.println(result);
        String word = obj.temporary(a);
        System.out.println(word);
    }
}
