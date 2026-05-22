import java.util.*;
import java.io.*;

public class Template {
    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;

    public static void main(String [] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        solve();

        out.close();
        out.flush();
    }

    static void solve() {
        int t = nextInt(); // Numero de despensas a evaluar
        int [] arr = new int[t]; // Ingrendientes disponibles en cada despensa

        for (int i = 0; i < t; i++) {
            arr[i] = nextInt();
        }




    }

    static String next() {
        while(st == null || !st.hasMoreTokens()) {
            try {
                String line = br.readLine();
                if(line == null) return null;
                st = new StringTokenizer(line);
            } catch(IOException e) {
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