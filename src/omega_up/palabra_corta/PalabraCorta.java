import java.util.*;
import java.io.*;

public class PalabraCorta {
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
        // Leemos la cantidad de palabras
        String primeraLectura = next();
        if (primeraLectura == null) return;
        int t = Integer.parseInt(primeraLectura);

        int minTamaño = Integer.MAX_VALUE;
        String palabraMasCorta = "";

        while(t-- > 0) {
            String palabraActual = next();
            if (palabraActual == null) break;

            if(palabraActual.length() < minTamaño) {
                minTamaño = palabraActual.length();
                palabraMasCorta = palabraActual;
            }
        }

        out.println(palabraMasCorta);
        out.println(minTamaño);
        if(minTamaño % 2 == 0) {
            out.println("par");
        } else  {
            out.println("impar");
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
}
