package collections;
import java.util.Map;
import java.util.HashMap;
public class MapInCollection {

	public static void main(String[] args) {
		//Map is an interface which takes a KEY and A VALUE as attributes.
		// Here the KEYS are SET and VALUES are LIST
		//it does not print its values in order
		Map<String,Integer> marks = new HashMap<String,Integer>();
		marks.put("Sudheer",92);
		marks.put("Praveen",82);
		marks.put("Prasad",85);
		marks.put("Mohan",75);
		marks.put("pradeep",90);
		marks.put("Sudheer",85);
		// The  keys are unique and the values for the keys can be changed. 
		// Duplicates are not allowed. it just update the value
		System.out.println(marks.keySet()+" : "+marks.values());
		// it prints the keyset and the values list.
		System.out.println(marks);	// prints the entire set
		for(String key: marks.keySet()) {
			System.out.println(key+" : "+marks.get(key));
		}
	}

}
