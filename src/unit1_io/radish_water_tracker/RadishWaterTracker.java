
import java.io.*;
import java.util.*;

/**
 * Problem Name: Reading a Simple Array.
 * Description: Read a number 'n', then read an array of 'n' elements and print the sum using fast read.
 * * Platform: Custom Practice
 * * @author SILVAJESUS2005
 * @date 2026-03-05
 */

public class RadishWaterTracker {

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
        // 1. Leer el primer numero suelto (N)
        int n = nextInt();

        // 2. Preparar una variable para el resultado
        long totalAgua = 0;

        // 3. Leer los N elementos siguientes en un ciclo
        for (int i = 0; i < n; i++) {
            int mililitros = nextInt();
            totalAgua += mililitros;
        }

        // 4. Imprimir el resultado usando nuestro PrintWriter 'out'
        out.println("Total de agua usada: " + totalAgua + " ml");
    }

    static String next() {
        while (st == null || !st.hasMoreElements()) {
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
