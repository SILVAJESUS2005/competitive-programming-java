import java.util.*;
import java.io.*;

public class Tablas {
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
    int [] nElementos = new int[n];

    for (int i = 0; i < n; i++) {
        nElementos[i] = nextInt();
    }

    for (int i = 0; i < nElementos.length; i++) {
        for (int j = 1; j <= 10; j++) {
            out.println(nElementos[i] + "x" + j + "=" + (nElementos[i] * j));
        }
        out.println("");
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