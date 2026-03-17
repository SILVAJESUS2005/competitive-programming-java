import java.util.*;
import java.io.*;

public class ContratacionDinamica {
    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;

    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        solve();

        out.flush();
        out.close();
    }

    static void solve() {
     int n = nextInt();
     int k = nextInt();
     int [] array = new int [n];

     for (int i = 0; i < n; i++) {
         array[i] = nextInt();
     }

     for (int i = 0; i <= n - k; i++) {
        int max = array[i];
        for (int j = 1; j < k; j++) {
            if(array[i + j] > max) {
                max = array[i + j];
            }
        }
        out.print(max + " ");
     }

    }

    static String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                String line = br.readLine();
                if (line == null) return null;
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