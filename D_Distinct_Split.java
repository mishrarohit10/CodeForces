import java.util.*;
public class D_Distinct_Split {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            String s = in.next();

            int[] left = new int[26];
            int[] right = new int[26];

            for(int i=0; i<n;i++) {
                left[s.charAt(i)- 'a']++;
            }
            int maxRes = 0;

            for(int i=0; i<n; i++)
            {
                left[s.charAt(i) - 'a']--;
                right[s.charAt(i) - 'a']++;
                int res = 0;

                for(int j=0;j<26;j++) {
                    res+= Math.min(left[j],1) + Math.min(right[j],1);
                    maxRes = Math.max(maxRes,res);
                }
            }
            System.out.println(maxRes);
        }
    }
}