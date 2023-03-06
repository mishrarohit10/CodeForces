import java.util.*;
public class B_Ideal_Point {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int L =0 , R = 55;
            while(n-->0) {
                int l,r;
                 l = in.nextInt();
                 r = in.nextInt();
                if(l<=k && k<=r) {
                    L = Math.max(L,l);
                    R = Math.min(R,r);
                }
            }
            System.out.println(L == R ? "YES\n" : "NO\n");
        }
    }
}