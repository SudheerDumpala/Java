package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
	/* Stream API is available from java 1.8.
	Stream is an interface which is consists of multiple methods
	like map,reduce, filter etc which are useful to do operations on
	the data without changing the original data.*/
	public static void main(String[] args) {
		List <Integer> nums = Arrays.asList(1,5,6,2,3,4);
		
		// TASK :  TO DOUBLE ALL THE EVEN NUMBERS IN THE LIST AND GET THEIR SUM
		
		/* general method
		int sum = 0;
		for(int i: nums) {
			if(i%2==0) {
				i = i*2;
				sum += i;
			}
		}
		System.out.println(sum); */
		
		/* STREAM API 
		Stream <Integer> s1 = nums.stream(); // S1 contains all the value
		// present in the nums. ('stream' is the object of the "Stream")
		Stream <Integer> s2 = s1.filter(n -> n%2 ==0);
		Stream <Integer> s3 = s2.map(i -> i*2);
		int s4 = s3.reduce(0, (c,e) -> c+e);
		System.out.println(s4);
		*/
		
		/* ENHANCED STREAM*/
		int result = nums.stream()
			.filter(n -> n%2 ==0)
			.map(i -> i*2)
			.reduce(0, (c,e) -> c+e);
		System.out.println(result);
	}

}
