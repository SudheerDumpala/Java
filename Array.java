/*CONCEPT OF ARRAYS IN JAVA
 */
import java.lang.Math;
public class Array {
    public static void main(String args[]){
        int i,j;
        int arr[][] = new int[3][4];
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                arr[i][j] = (int) (Math.random()*10);
            }
        }
        /*for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }*/
        for (int n[]: arr){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
