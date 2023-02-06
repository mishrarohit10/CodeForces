import java.util.*;
public class C_Prepend_and_Append {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++) {
            int len = in.nextInt();
            String s = in.next();
            int ans = len;
            int l = 0;
            int r = len - 1;
            while(s.charAt(l)!=s.charAt(r) && ans > 0) {
                l++;
                r--;
                ans -=2;
            }
            System.out.println(ans);
        }
    }
}