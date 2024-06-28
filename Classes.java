/* WELCOME TO THE WORLD OF CLASSES AND OBJECTS*/

class Addition
{
	public int adding(int n1,int n2){
	int result = n1 + n2;
	return result;
	}
}
public class Classes {

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		Addition add = new Addition();
		int res = add.adding(a,b);
		System.out.println(res);
	}
}
