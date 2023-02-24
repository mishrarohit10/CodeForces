import java.util.*;
public class A_One_and_Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int c2=0;
            for(int i=0;i<n;i++) {
                arr[i] = in.nextInt();
                if(arr[i]==2) {
                    c2++;
                }
            }
            if(c2==0) {
                System.out.println("1");
            }
            else if(c2%2!=0) {
                System.out.println("-1");
            }
            else  {
                int res = 0;
                for(int i=0; i<n;i++) {
                    if(arr[i]==2)
                    res++;
                    if(res==(c2/2)) {
                        System.out.println(i+1);
                        break;
                    }
                }
            }
        }
    }
}
