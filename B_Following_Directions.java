//B_Following_Directions
import java.util.Scanner;

public class B_Following_Directions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int len = in.nextInt();
            String s = in.next();
            int x=0,y=0;
            for(int i=0;i<len;i++) {
                if(s.charAt(i)=='L') {
                    x--;
                }
                else if(s.charAt(i)=='R') {
                    x++;
                }
                else if(s.charAt(i)=='U') {
                    y++;
                }
                else {
                    y--;
                }
                if(x==1 && y==1) {
                    System.out.println("YES");
                    break;
                }
            }
            if (x != 1 || y != 1) {
                System.out.println("NO");
            }
        }
        in.close();
    }
}
