import java.util.*;
import java.io.*;

public class Chicharronera {
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

        double A = nextInt();
        double B = nextInt();
        double C = nextInt();

        double D = B * B - 4 * A * C;

        double x1 = (-B + Math.sqrt(D)) / (2 * A);
        double x2 = (-B - Math.sqrt(D)) / (2 * A);
    out.print(x1 + " " + x2);
    }

    static String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                String line = br.readLine();
                if (line == null) {
                    return null;
                }
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