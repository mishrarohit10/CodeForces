import java.io.*;
import java.util.*;
 
public class B_Sum_of_Two_Numbers {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner cs = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int t = cs.nextInt();
        while(t-- > 0) {
            String s=cs.next();
            boolean flag=true;
            String a = "", b = "";
            for(int i=0;i<s.length();i++) {
                int c = s.charAt(i)-'0';
                if(c%2 ==0) {
                    a += c/2;
                    b += c/2;
                }
                else {
                    if(flag) {
                        a += c/2;
                        b += (c/2)+1;
                    }
                    else {
                        b += c/2;
                        a += (c/2)+1;
                    }
                    flag ^= true;
                }
            }
            out.println(Integer.parseInt(a)+" "+Integer.parseInt(b));
        }
        out.close();
    }
}