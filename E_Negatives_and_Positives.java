
    import java.util.*;
 
    public class E_Negatives_and_Positives{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            int t = input.nextInt();
            int x = 0;
            while(t-->0){
                int n = input.nextInt();
                ArrayList<Integer> array = new ArrayList<Integer>();
                int m = Integer.MAX_VALUE;
                int neg = 0;
                int sum = 0;
                for(int i = 0;i<n;i++){
                    x = input.nextInt();
                    array.add(x);
                    sum += Math.abs(x);
                    m = Math.min(m,Math.abs(x));
                    if(x < 0) { neg++; }
                }
                if(neg % 2 == 0){System.out.println(sum);}
                else{
                    System.out.println(sum - 2 * m);
                }
            }
        }
    }    