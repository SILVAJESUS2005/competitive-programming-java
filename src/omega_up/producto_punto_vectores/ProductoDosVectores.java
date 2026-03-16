import java.util.*;
import java.io.*;

public class ProductoDosVectores {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        solve();

        out.flush();
        out.close();
    }

    static void solve(){
        int r = nextInt();
        int [] a = new int[r];
        int [] b = new int[r];
        int suma = 0;

        for(int i = 0; i < r; i++){
            a[i] = nextInt();
        }

        for(int j = 0; j < r; j++){
            b[j] = nextInt();
        }

        int incremento = 0;
       for(int i = 0; i < r; i++){
           suma += a[i]*b[incremento];
           incremento++;
       }
       out.println(suma);
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

    static int nextInt(){
        return Integer.parseInt(next());
    }
}