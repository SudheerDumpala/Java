/* METHOD OVERLOADING IN JAVA */

class overload {
    public int loading(int n1,int n2,int n3) {
        int res = n1+n2+n3;
        return res; 
    }
    public int loading(int n1,int n2) {
        int res = n1+n2;
        return res; 
    }
    public double loading(double n1,double n2,double n3) {
        double res = n1+n2+n3;
        return res; 
    }

}
public class overloading {
    public static void main(String args[]){
        int n1 = 5, n2 = 3, n3 = 6;
        overload obj = new overload();
        int result = obj.loading(n1,n2,n3);
        int ans = obj.loading(n1,n2);
        double sol = obj.loading(n1, n2, n3);
        System.out.println(result);
        System.out.println(ans);
        System.out.println(sol);

    }
}
