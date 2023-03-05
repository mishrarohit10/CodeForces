import java.io.*;
import java.util.*;
public class A_Prefix_and_Suffix_Array {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner in = new Scanner(System.in);
    static String reverse_String(String s){
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) throws Exception {
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            String[] st = new String[2*(n-1)];
            for(int i=0; i<2 * n - 2;i++) {
                st[i] = in.next();
            }
            List<String> ls = new ArrayList<>();
            for(int i=0;i<2 * n - 2;i++) {
                if(st[i].length()==n-1) {
                    ls.add(st[i]);
                }
            }
            if(ls.get(0).equals(reverse_String(ls.get(1)))) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        out.close();
    }
}