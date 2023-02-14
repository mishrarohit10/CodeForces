import java.util.*;
public class A_GamingForces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int c1=0;
            for(int i=0;i<n;i++) {
                arr[i] = in.nextInt();
                if(arr[i]==1) {
                    c1++;
                }
            }
            if(c1%2==0) {
                System.out.println(c1/2 + (n-c1));
            }
            if(c1%2!=0) {
                System.out.println(c1/2 + (n-c1+1));
            }
        }
    }
}