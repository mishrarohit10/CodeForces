import java.util.*;
public class B_Ideal_Point {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int start = 0;
            int end = 0;
            for(int i=0;i<n;i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                if(l==k) {
                    start++;
                }
                if(r==k) {
                    end++;
                }
            }
            if(start>0 && end>0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}