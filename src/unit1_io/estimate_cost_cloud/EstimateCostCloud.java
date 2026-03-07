import java.io.*;
import java.util.*;

/**
 * Problem Name: Cloud Cost Estimation.
 * Description: Calculates the quarterly total cost for different cloud services
 *  * based on monthly billing reports. Practices reading multiple test cases.
 *  * Platform: Custom Practice.
 * * @author SILVAJESUS2005
 * @date 2026-03-06
 */

public class EstimateCostCloud {
    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;

    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int t = nextInt();
        while (t-- > 0) {
            solve();
        }

        out.flush();
        out.close();
    }

    static void solve() {
        // Lógica para UN SOLO caso de prueba (un solo servicio)

        // 1. Leer el nombre del servicio (hasta el primer espacio)
        String serviceName = next();

        // 2. Leer los costos de los 3 meses.
        // Usamos double porque los costos tienen decimales.
        double month1 = nextDouble();
        double month2 = nextDouble();
        double month3 = nextDouble();

        // 3. Calcular el total del trimestre
        double totalQuarterlyCost = month1 + month2 + month3;

        // 4. Imprimir el resultado con el formato solicitado
        out.println(serviceName + ": " + totalQuarterlyCost);
    }

    static String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                String line = br.readLine();
                if(line == null) break;
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