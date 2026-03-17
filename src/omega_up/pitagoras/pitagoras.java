import java.util.*;
import java.io.*;

public class pitagoras {
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
        double a, b;
        a = nextDouble();
        b = nextDouble();
        out.printf("%.3f", hipotenusaTriangulo(a, b));
    }

    static double hipotenusaTriangulo(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    static String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }
    static double nextDouble() {
        return Double.parseDouble(next());
    }

}