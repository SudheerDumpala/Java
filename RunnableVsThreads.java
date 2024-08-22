// Runnable vs Threads in java (using lambda)
// Runnable is a Functional Interface
/*
class Threads1 implements Runnable{ // we need to extend "Thread" in order to make the class Thread
    public void run(){
        for(int i = 0; i<5;i++){
            System.out.println("Hello Sudheer");
            try {
                Thread.sleep(10); // we are asking the thread to sleep for 10 milli seconds
            } 
            catch (InterruptedException e) { e.printStackTrace();
            }
        }
    }
}
class Threads2 implements Runnable{
    public void run(){  // The obj.start method calls this run method
        for(int i = 0; i<5;i++){
            System.out.println("Hii Praveen");
            try {
                Thread.sleep(10); // we are asking the thread to sleep for 10 milli seconds
            } 
                catch (InterruptedException e) { e.printStackTrace();
            }
        }
    }
}*/
public class RunnableVsThreads{
    public static void main(String[] args) {

        /*
        Runnable obj1 = new Threads1(); // reference of the Inerface and oject of the class
        Runnable obj2 = new Threads2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t2.start();
        t1.start();
        */
        // BY USING THE CONCEPT OF ANONYMOUS INNER CLASS
        Runnable obj1 = () -> { // we can apply lambda expression because Runnable is a Functional interface
                for(int i = 0; i<5;i++){
                    System.out.println("Hello Sudheer");
                    try {Thread.sleep(10);} catch (InterruptedException e) { e.printStackTrace();}
                }
            };
        Runnable obj2 = () -> {
                for(int i = 0; i<5;i++){
                    System.out.println("Hii Praveen");
                    try {Thread.sleep(10);}catch (InterruptedException e) { e.printStackTrace();}
                }
            };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}