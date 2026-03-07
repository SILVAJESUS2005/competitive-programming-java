import java.io.*;
import java.util.*;

/**
 * Problem Name: Mixed Reading (Texts and decimals).
 * Description: Read 'n' players, iterate 'n' times to process each player and print directly after processing the data.
 * * Platform: Custom Practice
 * * @author SILVAJESUS2005
 * @date 2026-03-05
 */

public class BasketballStats {
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
        // 1. Leer la cantidad de jugadores
         int p = nextInt();

         // 2. Iterar P veces para procesar a cada jugador
         for (int i = 0; i < p; i++) {
             // next() lee un String hasta el primer espacio.
             // nextDouble() lee un número decimal.
             String nombre = next();
             double puntos = nextDouble();

             // 3. Imprimir  directamente procesando los dato
             out.println("Jugador: " + nombre + " | Promedio: " + puntos );
         }
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
     static double nextDouble() {
        return Double.parseDouble(next());
     }
}