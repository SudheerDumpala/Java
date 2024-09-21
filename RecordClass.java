package recordclass;

/*All the variables in the record are by default private and immutable,
this is because,
The records are the type of classes which its functions is only carrying the data
 so its no need to mutate them */

/* by using the record, we are no need to create the setters and getters methods
 * and also the toString() methods to convert the output hashcode to string*/
record data(int id,String name) {
	public data(int id,String name){
		//canonical constructor, this is not mandatory
		this.id = id;
		this.name = name;
		if(id == 0) {
			throw new IllegalArgumentException("id 0 is not allowed..!");
		}
				
	}
}
public class RecordClass {

	public static void main(String[] args) {
		//data obj0 = new data(00,"xyz"); //this throws the IllegealArgumentException
		data obj = new data(01,"Sudheer");
		data obj1 = new data(02,"praveen");
		System.out.println(obj1);
		System.out.println(obj.equals(obj1));
	}

}
