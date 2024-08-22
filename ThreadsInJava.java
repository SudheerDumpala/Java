// Threads and Multiple Threads in Java
class Threads1 extends Thread{ // we need to extend "Thread" in order to make the class Thread
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
class Threads2 extends Thread{
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
}
public class ThreadsInJava{
    public static void main(String[] args) {
        Threads1 obj1 = new Threads1();
        Threads2 obj2 = new Threads2();
        // obj2.setPriority(Thread.MAX_PRIORITY); This increases the priority of the Thread
        obj1.start();
        obj2.start();
    }
}