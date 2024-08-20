// String Builder in java is Mutable, it is released in java 1.5 version
// It is non-synchronisesd and not thread safe and 
// faster performance when-compared to String Buffer due to it's non-thread

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sudheer");
        sb.insert(0,"Dumpala"); // to insert at the specific index
        System.out.println(sb);
        sb.deleteCharAt(5); // to delete charAT specific Index
        System.out.println(sb);
        sb.delete(0,6); // to delete the characters in specific range
        System.out.println(sb);
        // NOTE: these characters only delete upto one number before the given range
        sb.append(" Dumpala");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity()); // By default, the capacity is set to 16 + the input string
        sb.ensureCapacity(50); // it increases thr default capacity
        System.out.println(sb.capacity()); // output 50 because the defined value "sudheer" can adjust within
        //Note: the capacity shows how much space the StringBuilder
        // has reserved, and it doesn't always match the exact length of the string it currently holds.
        sb.append("Praveen is a senior software engineer");

        // in this case, we increase length beyond the defined (50) to more, so it will adjust accordingly
        System.out.println(sb.capacity()); 
         
        StringBuilder sb1 = new StringBuilder("sudheer is a senior software engineer");
        System.out.println(sb == sb1); // checks the addreess
        System.out.println(sb.equals(sb1)); // checks the address
        System.out.println(sb.compareTo(sb1)); // checks the data (return 0 if equals, negative if not)
    }
}
