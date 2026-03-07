import java.io.*;
import java.util.*;

/**
 * Problem Name: final distance robot.
 * Description: The first line gives you a number C (number of commands).
 * Subsequent lines C contain a letter (F or B) and an integer indicating centimeters. (Let's assume the robot starts at position 0. 'F' adds, 'B' subtracts.)
 * * * Platform: Custom Practice
 * * @author SILVAJESUS2005
 * @date 2026-03-06
 */

public class FinalDistanceRobot {
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
    int c = nextInt();
    long totalNumero = 0;

    for (int i= 0; i < c; i++) {
        String letra = next();
        long numero = nextLong();
        if(letra.equals("F")){
            totalNumero += numero;
        }else if(letra.equals("B")){
            totalNumero -= numero;
        }
    }

    out.println(totalNumero);
    }

    static String next() {
        // StringTokenizer divide la línea en "tokens" ignorando los espacios en blanco.
        while(st == null || !st.hasMoreElements()) {
            try {
                String line = br.readLine();
                if (line == null) return null; // Fin del archivo (EOF)
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
    static long nextLong() {
        return Long.parseLong(next());
    }
}