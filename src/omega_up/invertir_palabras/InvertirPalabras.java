import java.util.*;
import java.io.*;

public class InvertirPalabras {
    static BufferedReader br;
    static PrintWriter out;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        solve();

        out.flush();
        out.close();
    }

    static void solve() throws IOException {
        String linea;

        while ((linea = br.readLine()) != null) {

            int i = 0;
            int n = linea.length();

            while (i < n) {

                if (linea.charAt(i) == ' ') {
                    out.print(" ");
                    i++;
                } else {
                    int inicio = i;

                    while (i < n && linea.charAt(i) != ' ') {
                        i++;
                    }

                    int fin = i - 1;

                    for (int j = fin; j >= inicio; j--) {
                        out.print(linea.charAt(j));
                    }
                }
            }

            out.println();
        }
    }
}