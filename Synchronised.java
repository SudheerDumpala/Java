// uauage of Schronised in multiple thread handling
// Race Conditions
class counter{
    int count;
    public synchronized void counting(){
        count++;
    }
}

/* when we dont use the synchronised in te class, there is a high possibility that  
 * two threads can access the method same time(Race Conditions)it leads to the count 
 * function count only one time for the both threads which accessed the method. 
 * synchonised prevents this Race Conditions.
 */
public class Synchronised {
    public static void main(String[] args) throws InterruptedException {
        counter obj = new counter();
        Runnable obj1 = () -> {
                for(int i=0;i<1000;i++){
                    obj.counting();
                }
        };
        Runnable obj2 =() -> {
                for(int i=0;i<1000;i++){
                    obj.counting();
                }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join(); // we are telling the main method to wait until t1 and t2 joined
        t2.join(); // join throws an interrupted Exception
        System.out.println("The total count is: "+obj.count);
    }
}
