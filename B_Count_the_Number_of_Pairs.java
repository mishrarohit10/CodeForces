import java.util.*;
import java.io.*;

public class B_Count_the_Number_of_Pairs{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                int n = in.nextInt();
                int k = in.nextInt();
                String s = in.next();
                int[] upp = new int[26];
                int[] low = new int[26];
                for(int i=0;i<s.length();i++) {
                    if(Character.isUpperCase(s.charAt(i))) {
                        upp[s.charAt(i)-'A']++;
                    }
                    else {
                        low[s.charAt(i)-'a']++;
                    }
                }
                int ans=0;
                for(int i=0;i<26;i++) {
                    int pairs = Math.min(upp[i],low[i]);
                    ans+=pairs;
                    upp[i] -= pairs;
                    low[i] -= pairs;
                    int add = Math.min(k,Math.max(upp[i],low[i])/2);
                    k -= add;
                    ans += add;
                }
                System.out.println(ans);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
