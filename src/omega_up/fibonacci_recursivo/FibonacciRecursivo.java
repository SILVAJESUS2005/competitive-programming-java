import java.util.*;
import java.io.*;

public class FibonacciRecursivo {

    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;

    static int llamadas = 0;

    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        solve();

        out.flush();
        out.close();
    }

    static void solve() {
        int n = nextInt();

        int resultado = fibonacci(n);

        out.println(resultado + " " + llamadas);
    }

    public static int fibonacci(int n) {
        llamadas++; // cuenta la llamada

        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static String next() {
        while (st == null || !st.hasMoreTokens()) {
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