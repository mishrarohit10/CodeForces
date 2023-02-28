import java.util.*;
import java.io.*;

public class A_Recent_Actions{
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
                int m = in.nextInt();
                ArrayList<Integer> list = new ArrayList<Integer>();
                for(int i=0;i<m;i++) {
                    int l = in.nextInt();
                    list.add(l);
                }
                HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
                for(int i=0;i<n;i++) {
                    map.put(i, -1);
                }
                int lol = 1 , temp = n;
                for(int i=0;i<m;i++) {
                    if(temp==0) {
                        break;
                    }
                    if(!map.containsKey(list.get(i))) {
                        map.put(list.get(i), 1);
                        map.put(temp, lol);
                        temp--;
                    }
                    lol++;
                }
                for (int i = 1; i <= n; i++) {
                    if (map.containsKey(i)) {
                        System.out.print(map.get(i) + " ");
                    }
                }
                System.out.println();
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
