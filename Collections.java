// concept of collection in java
//import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//import java.util.HashSet;

public class Collections {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        //Collection<Integer> nums = new ArrayList<Integer>();
        //As List is a part of the collection, we can use either of them to do operations
        nums.add(15);
        nums.add(51);
        nums.add(10);
        nums.add(45);

        for(Object n: nums){
            int num = (Integer)n;
            System.out.println(num);
        }
        // Here we are using the list,which allows the duplicate values.
        // To prevent that, we can use a set, which is also a part of the collection
        System.out.println("------------------------------");

        // Sets doen't follow the sequence,it gives the random values everytime

       /* Set <Integer> numbers = new HashSet<Integer>(); */
       // Hashset gives the unsorted Set

       Set <Integer> numbers= new TreeSet<Integer>();
        // We can uswe the "TreeSet" to get the sorted set as result
             
        numbers.add(15);
        numbers.add(81);
        numbers.add(10);
        numbers.add(18);
        numbers.add(45);
        numbers.add(81); // Here thew duplicate value will be ignored by the set
    
        /*for(int n: numbers){
            System.out.println(n);
        }*/
        //Instead of using the for loop, we can use the "Iterator" to get the values

        Iterator<Integer> values = numbers.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }

        
    }
}
