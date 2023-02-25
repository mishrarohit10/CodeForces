import java.util.*;
public class A_Ploycarp_and_the_Day_of_Pie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String pie = "31415926535897932384626433832795028841971693993751058209749445923078164062862089";
        while(t-->0) {
            String s = in.next();
            int count = 0;
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i)==pie.charAt(i)) {
                    count++;
                }
                else {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
