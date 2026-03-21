import java.util.*;
import java.io.*;

public class EncontrandoDigitos {
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

        int[] contador = new int[10];

        for (int i = 0; i < n; i++) {
            try {
                String linea = br.readLine();

                for (int j = 0; j < linea.length(); j++) {
                    char c = linea.charAt(j);

                    if (Character.isDigit(c)) {
                        int digito = c - '0';
                        contador[digito]++;
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i <= 9; i++) {
            out.println("El " + i + " aparece " + contador[i] + " veces.");
        }
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