import java.util.*;
import java.io.*;

public class Reverso {
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
        int [] nElements = new int[n];

        for (int i = 0; i < nElements.length; i++) {
            nElements[i] = nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            out.print(nElements[i] + " ");
        }
    }

    static String next() {
        while(st == null || !st.hasMoreTokens()) {
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