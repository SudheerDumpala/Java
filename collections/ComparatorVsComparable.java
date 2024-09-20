package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student implements Comparable<Student>{
	String name;
	int age;
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	// toString method is by default in the class, here we are overriding
	// the toString method to convert the object type to String type output
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	// The compareTo method is by default present in the Comparable interface
	@Override
	public int compareTo(Student that) {
		if(this.age>that.age) {
			return 1;
			}
			else {
				return -1;
			}
	}
	
}
public class ComparatorVsComparable {
	// Comparator is used to implement our own logic instead of the default
	// whereas Comparable is used to compare its own objects with in the class
	public static void main(String[] args) {
		// as Comparator is a functional interface, we can use the functional interface
		
		Comparator <Student> students = (i,j) ->  (i.age>j.age)? 1:-1;
		
		List<Student> studs= new ArrayList<>();
		studs.add(new Student("sudheer",19));
		studs.add(new Student("praveen",26));
		studs.add(new Student("prasad",21));
		studs.add(new Student("pradeep",23));
		studs.add(new Student("mohan",51));

		/* if we use the Comparator, we need to give the object of it externally
		to the "Collections.sort()" this is because we are passing the list  along
		with the Comparator(it acts as 3rd person to compare the objects) */
		
		//Collections.sort(studs,students);
		Collections.sort(studs);
		
		// when using the Comparable, it is comparing its own objects, so there is no
		// need for passing the object externally (3rd person)
		for(Student s: studs) {
			System.out.println(s);
		}
	}

}
