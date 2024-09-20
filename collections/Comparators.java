package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
public class Comparators {

	public static void main(String[] args) {
		// Comparator allows us to work on our own logic of sorting instead 
		//of the default sorting method
		// EX: sort the following valued based on their last digit
		Comparator<Integer> comp = new Comparator<>() {
			public int compare(Integer i,Integer j) {
				if(i%10>j%10) {
					return 1;
				}
				else {
					return -1;
				}
			}
		};
		List<Integer> ages = new ArrayList<>();
		ages.add(45);
		ages.add(72);
		ages.add(47);
		ages.add(15);
		ages.add(39);
		ages.add(91);
		Collections.sort(ages,comp);
		System.out.println(ages);
	}
}
