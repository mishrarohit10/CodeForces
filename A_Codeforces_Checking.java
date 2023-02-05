import java.util.Scanner;

public class A_Codeforces_Checking {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    String codeforces = "codeforces";
    for (int i = 0; i < t; i++) {
      char c = sc.next().charAt(0);
      if (codeforces.indexOf(c) != -1) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
