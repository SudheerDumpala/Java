
enum Status{     //enum is a type of class
    Started,waiting,Running,Succeed,Failed; // by default,the variable type things in the enum class are objects.
}
public class EnumIntro{
    public static void main(String[] args) {
        // by using the enhanced for loop (for-each loop)
        /*Status[] ref = Status.values();
        for(Status s:ref){
            System.out.println(s+" "+s.ordinal());
        }*/
        // we can also access the elements by using the "Switch" statement

        Status s = Status.waiting;
        switch(s){
            case Started:
                System.out.println("Just Started");
            case waiting:
                System.out.println("Please wait ...");
            case Running:
                System.out.println("Loadingg ...");
            case Succeed:
                System.out.println("Successfully Executed");
            case Failed:
                System.out.println("Oops!! Failed");
        }
    }
}