import java.util.*;
import java.io.*;

public class UlamOrdenado {
    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;

    public static void main(String [] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        solve();

        out.flush();
        out.close();
    }

    static void solve() {
        long n = nextLong();
        List<Long> lista = new ArrayList<>();

        while (true) {
            lista.add(n);

            if (n == 1) break;

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
        }
        Collections.sort(lista);
        for (long num : lista) {
            out.print(num + " ");
        }
    }

    static String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                String line = br.readLine();
                if (line == null) {
                    return null;
                }
                st = new StringTokenizer(line);
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }

        return st.nextToken();
    }

    static long nextLong() {
        return Long.parseLong(next());
    }
}