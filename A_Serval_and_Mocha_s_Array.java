import java.io.*;
import java.util.*;
 
public class A_Serval_and_Mocha_s_Array {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) {
                a[i] = in.nextInt();
            }
            int maxx = Integer.MAX_VALUE;
            for(int i=0;i<n;i++) {
                int j=i+1;
                while(j<n)
                {
                maxx = Math.min(maxx,gcd(a[i],a[j]));
                j++;
            }
            }
            if(maxx>2) {
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
        }
        out.close();
    }
    public static int gcd(int a, int b) {
        if(b==0) {
            return a;
        }
        else {
            return gcd(b, a%b);
        }
    }
}