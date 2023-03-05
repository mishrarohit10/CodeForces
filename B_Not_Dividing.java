import java.io.*;
import java.util.*;
 
public class B_Not_Dividing {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = in.nextInt();
            }
            for(int i=0;i<n;i++) {
                if(arr[i]==1) {
                    arr[i]++;
                }
            }
            for(int i=1;i<n;i++) {
                if(arr[i]%arr[i-1]==0) {
                    arr[i]++;
                }
            }
            for(int i: arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        out.close();
    }
}