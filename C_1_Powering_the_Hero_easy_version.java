import java.io.*;
import java.util.*;
 
public class C_1_Powering_the_Hero_easy_version {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = in.nextInt();
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            long sum = 0;
            for(int i=0;i<n;i++) {
                if(arr[i]>0) {
                    pq.add(arr[i]);
                }
                else {
                    if(pq.size()>0) {
                        sum = sum + pq.poll();
                    }
                }
            }
            System.out.println(sum);
        }
        out.close();
    }
}