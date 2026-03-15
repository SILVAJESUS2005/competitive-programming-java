import java.util.*;
import java.io.*;




public class FastReaderTemplate2 {

    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;

    public static void main(String[] args) {
        br = new BufferedReader( new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        solve();

        out.flush();
        out.close();
    }

    static void solve() {
        int N = nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N * 2; j++) {
                if (j <= N - i || j - i >= N) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println("");

        }
    }

    static String next() {
        while(st == null || !st.hasMoreTokens()) {
            try {
                String line = br.readLine();
                if(line == null) return null;
                st = new StringTokenizer(line);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

}


